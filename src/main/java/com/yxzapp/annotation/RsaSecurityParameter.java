package com.yxzapp.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

/**
 * @author youngyanjun
 * @date 2020-04-23 10:43
 */
    @Target({ElementType.METHOD,ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Mapping
    @Documented
    public @interface RsaSecurityParameter {

        /**
         * 入参是否解密，默认解密
         */
        boolean inDecode() default true;

        /**
         * 出参是否加密，默认加密
         */
        boolean outEncode() default true;
    }



