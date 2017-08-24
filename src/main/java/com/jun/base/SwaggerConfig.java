package com.jun.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by zz on 2017/8/24.
 */
@Configuration  //配置注解，自动在本类上下文加载一些环境变量信息
@EnableWebMvc
@EnableSwagger2 //使swagger2生效
@ComponentScan(basePackages = {"com.jun.api"})   //需要扫描的包路径
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()   //选择哪些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.jun.api"))
                .paths(PathSelectors.any())     //对所有api进行监控
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring 中使用Swagger2构建RESTful APIs")
                .termsOfServiceUrl("http://blog.csdn.net/he90227")
                .description("此API提供接口调用")
                .contact("xiaoer")
                .license("License Version 2.0")
                .licenseUrl("")
                .version("2.0")
                .build();
    }

}
