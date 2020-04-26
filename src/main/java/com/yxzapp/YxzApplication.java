package com.yxzapp;

import cn.shuibo.annotation.EnableSecurity;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yxzapp.modules.*.mapper")
@SpringBootApplication
@EnableSecurity
public class YxzApplication {

    public static void main(String[] args) {
        SpringApplication.run(YxzApplication.class, args);
    }

}
