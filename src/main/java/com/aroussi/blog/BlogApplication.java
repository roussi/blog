package com.aroussi.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Bean
	public Docket docket(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.aroussi.blog.web"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder()
								.title("ROUSSI Blog API")
								.description("Versiong 1 of my blog API")
								.contact(new Contact("ROUSSI Abdelghani",
										"https://www.abdelghani-roussi.com",
										"roussi.abdelghani@gmail.com"))
								.build());
	}
}
