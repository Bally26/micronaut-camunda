package com.workflow;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
    info = @Info(
            title = "micronaut-camunda",
            version = "0.0",
            description = "My API",
            license = @License(name = "Apache 2.0", url = "https://github.com/Bally26"),
            contact = @Contact(url = "https://github.com/Bally26", name = "Prabal", email = "prabals933631@gmail.com")
    )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}