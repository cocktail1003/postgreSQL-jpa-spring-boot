package com.ssii.foomap.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Name:Swagger2Config
 * Description: Swagger自动API文档配制
 * Author:leix
 * Time: 2017/7/7 16:19
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Value("${swagger.title}")
    String title;

    @Value("${swagger.description}")
    String description;

    @Value("${swagger.version}")
    String version;

    @Value("${swagger.basePackage}")
    String basePackage;

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .version(version)
                .build();
    }
}
