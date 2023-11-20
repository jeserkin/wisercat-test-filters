package eu.wisercat.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "eu.wisercat.test.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Wisercat Filters API")
                                .description("An API for reading/storing Wisercat Test Assignment filters.  ### Changelog 1.0.0 - Initially published draft.  #### HTTP Status Codes - 200 - OK. ")
                                .contact(
                                        new Contact()
                                                .email("support@wisercat.eu")
                                )
                                .version("1.0.0")
                )
        ;
    }
}