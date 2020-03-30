package com.young;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.young.modules.*.mapper")
@SpringBootApplication
public class YoungApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoungApplication.class, args);
    }

}
