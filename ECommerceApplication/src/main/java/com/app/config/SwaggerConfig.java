package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("E-Commerce Application")
                .description("Backend APIs for E-Commerce app")
                .version("v1.0.0")
                .contact(new Contact()
    .name("Reddy Akkamma Chandana, Rachabattuni Sai Sindhu")
    .url("https://github.com/Chandanac52, https://github.com/saisindhu218")
    .email("chandanachandu.ra@gmail.com, rsindhu0804@gmail.com")
)
            )
            .externalDocs(new ExternalDocumentation()
                .description("E-Commerce App Documentation")
                .url("http://localhost:8081/swagger-ui/index.html")  // updated port
            );
    }
}