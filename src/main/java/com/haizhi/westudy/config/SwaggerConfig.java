package com.haizhi.westudy.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author chanwcy
 * @Date 2022-01-23 11:58
 * @Version1.8
 */
@Configuration//配置类
@EnableSwagger2//swagger注解
public class SwaggerConfig {
    @Bean
    public Docket webApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("WeStudy")
                .apiInfo(webApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.haizhi.westudy.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("WeStudyApi文档")
                .description("描述接口定义")
                .version("1.0")
                .contact(new Contact("翁灿源", "http://westudy.com", "907359350@qq.com"))
                .build();
    }
}