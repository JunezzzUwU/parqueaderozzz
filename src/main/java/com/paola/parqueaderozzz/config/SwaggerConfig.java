package com.paola.parqueaderozzz.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - Parqueadero ZZZ")
                        .version("1.0")
                        .description("Documentación de la API para la gestión del parqueadero"));
    }
}
