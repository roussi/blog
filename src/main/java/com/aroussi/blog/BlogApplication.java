package com.aroussi.blog;

import com.aroussi.blog.config.aware.AuditorAwareImpl;
import com.aroussi.blog.model.Uzer;
import com.aroussi.blog.repository.UzerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
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
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    public Docket docket() {
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

    @Bean
    public CommandLineRunner runner(UzerRepository userRepository) {
        return args -> {
            userRepository.deleteAll();
            userRepository.save(Uzer.builder()
                    .login("aroussi")
                    .password("12345678")
                    .firstname("Abdelghani")
                    .lastname("ROUSSI")
                    .email("roussi.abdelghani@gmail.com")
                    .build());
        };
    }
    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditorAwareImpl();
    }
}
