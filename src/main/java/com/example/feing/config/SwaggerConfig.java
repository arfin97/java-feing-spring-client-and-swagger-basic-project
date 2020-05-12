package com.example.feing.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket swaggerConfiguration(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.feing"))
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiDetails(){
        return new ApiInfoBuilder()
                .title("Feing Client and Swagger Test Project")
                .description("Feing Client and Swagger Test Project")
                .version("V1.0")
                .license("©Arfin")
                .licenseUrl("https://www.banglalink.net")
                .contact(
                        new Contact(
                                "Md. Hafizur Rahman Arfin",
                                "https://www.arfin.me",
                                "arfin97@gmail.com"))
                .build();
    }

}
