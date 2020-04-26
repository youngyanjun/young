package com.yxzapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


/**
 * @author youngyanjun
 * @date 2020-03-21 15:24
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket adminApi() {
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("Token").description("user ticket")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数

        return new Docket(DocumentationType.SWAGGER_2)
                // 增加API相关信息
                .apiInfo(apiInfo("so-api", "后台", "1.0"))
                // 返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现
                .select()
                //扫描的包路径来定义指定要建立API的目录
                .apis(RequestHandlerSelectors.basePackage("com.yxzapp.modules.sys.controller"))
                .paths(PathSelectors.any())
                .build()
                .groupName("后台管理:adminApi接口文档V1.0");

    }

    private ApiInfo apiInfo(String s, String 站运营, String s1) {
        return new ApiInfoBuilder()
                .title("==易校招==使用Swagger2构建RESTful APIs")
                .version("1.0")
                .build();
    }

}
