package com.yxzapp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author youngyanjun
 * @date 2019-11-04 13:08
 */
@Target(ElementType.METHOD) //方法注解
@Retention(RetentionPolicy.RUNTIME) //运行时可见
public @interface OperationLog {

    //功能模块、操作的是什么模块
    String module() default "";
    //操作详情----CRUD--操作行为
    String action() default "";
}
