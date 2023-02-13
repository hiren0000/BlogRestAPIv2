package com.rebel.BlogAPIv2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

// here in this class we are configuring Swagger modifications
@Configuration
public class SwaggerConfig
{

    @Bean
    public Docket api()
    {
      return new Docket(DocumentationType.SWAGGER_2)
              .apiInfo(getInfo())
              .select()
              .apis(RequestHandlerSelectors.any())
              .paths(PathSelectors.any()).build();

    };

    public ApiInfo getInfo()
    {
        return new ApiInfo("Blogging Application", "This project is developed by Hiren Devmurari",
                "1.0","Terms of Service", new Contact("Hiren Devmurari", "https://hiren0000.github.io/", "hiru.devmurari@gmail.com")
                , "Licence of url ", "API licence url", Collections.emptyList());
    };

}
