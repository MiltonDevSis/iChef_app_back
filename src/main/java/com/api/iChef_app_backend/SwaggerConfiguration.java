package com.api.iChef_app_backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@EnableSwagger2
public class SwaggerConfiguration extends WebMvcConfigurationSupport {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.api.iChef_app_backend"))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(createMetaInfo());

//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(metaInfo());
    }

    private ApiInfo createMetaInfo() {
		ApiInfo lApiInfo = new ApiInfo("API REST STI", "API REST Focos de dengue", "1.0",
				"Uso restrito para estudantes", new Contact("Trabalho de Computação Urbana", "", ""),
				"Chefe Apache License Version 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
		return lApiInfo;
	}

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
