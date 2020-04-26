package com.yxzapp.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yxzapp.po.BaseEntity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author youngyanjun
 * @since 2020-04-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_user")
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 逻辑删除，0 删除 1 可用  2 冻结
     */
    private Integer isFlag;

    /**
     * 用户（固定电话）
     */
    private String phone;

    /**
     * 密码盐值
     */
    private String salt;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 用户手机（移动设备）
     */
    private String mobile;

    /**
     * 是否可以的登录
     */
    private Integer loginFlag;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 用户头像
     */
    private String photo;

    /**
     * 用户类型
     */
    private Integer userType;

    /**
     * 邮箱
     */
    private String email;


}
