package com.yxzapp.aspect;

import com.yxzapp.annotation.OperationLog;
import com.yxzapp.commons.CommonEnumExperience;
import com.yxzapp.modules.sys.entity.SysLog;
import com.yxzapp.modules.sys.entity.SysUser;
import com.yxzapp.modules.sys.mapper.MSysLogMapper;
import com.yxzapp.modules.sys.service.ISysUserService;
import com.yxzapp.po.ResultBody;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * @author youngyanjun
 * @date 2020-04-24 13:30
 * 用户操作日志入表切点可以用来记录用户操作行为，用户操作数据，用户设备地址（IP）
 */
public class LogAspect {


    @Resource
    UserSessionUtils userSessionUtils;
    @Resource
    ISysUserService iSysUserService;
    @Resource
    MSysLogMapper mSysLogMapper;

    //配置切点连接的自定义注解
    @Around("@annotation(com.yxzapp.annotation.OperationLog)")
    public Object saveLgoAroundAdvice(ProceedingJoinPoint pjp) {
        // 1.方法执行前的处理，相当于前置通知
        // 获取方法签名
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        // 获取方法
        Method method = methodSignature.getMethod();
        // 获取方法上面的注解
        OperationLog logAnno = method.getAnnotation(OperationLog.class);
        // 获取操作描述的属性值
        String action = logAnno.action();//用户行为--操作行为
        String module = logAnno.module();//操作模块
        SysLog sysLog = new SysLog(); //创建日志对象
        //获取操作的用户
        sysLog.setModule(module);    //设置对象的modle属性
        sysLog.setAction(action);   //设置用户的action属性
        Object result = null;
        try {
            result = pjp.proceed();
            Signature signature = pjp.getSignature();
            //对象转换
            ResultBody resultBody = (ResultBody) result;
            //成功记录日志，否则什么也不做，，例如新增校验数据不合法，不记录日志,可以有效防止刷库
            if (resultBody.getCode().equals(CommonEnumExperience.SUCCESS.getResultCode())) {
                //插入日志
                //获取操作的用户
                SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
                //设置操作的用户
                sysLog.setCreateBy(user.getId());
                mSysLogMapper.insert(sysLog);
            }
        } catch (Throwable throwable) {
        } finally {
        }
        return result;
    }


}
