package com.flashcards.app.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean

class SwaggerConfig {
    @Bean
    fun customOpenAPI(): OpenAPI? {
        return OpenAPI().info(
            io.swagger.v3.oas.models.info.Info().title("Spring Cloud Flashcard App")
                .version("1").description("demo flashcardd app")
                .termsOfService("http://swagger.io/terms/")
                .license(
                    License().name("Apache 2.0")
                        .url("http://springdoc.org")
                )
        )
    }
}