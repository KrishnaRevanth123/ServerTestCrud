package com.spring.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.spring.test")).paths(regex("/rest.*")).build();
		//.groupName("Krishna Revanth").apiInfo(apiInfo()).select()
		//.paths(regex("/kaiburr_Test.*")).build();
	}
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder().title("Kaiburr_Assesment_Test")
				.description("Sample documentation using swagger2 for our Rest Api")
				.build();
	}

}
