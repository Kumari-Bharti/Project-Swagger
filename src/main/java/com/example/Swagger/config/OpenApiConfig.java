package com.example.Swagger.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
	info = @Info(
			title = "Book API",
			description = "Crud operations"
			),
	servers = {
			@Server(
					description = "Dev",
					url ="http://localhost:8080"
	),
@Server(
		description = "Test",
		url ="http://localhost:8080"
)	
	}
	)
//@SecurityScheme(
//		name ="authBearer",
//		in = SecuritySchemeIn.HEADER,
//		type=SecuritySchemeType.HTTP,
//		bearerFormat = "JWT",
//		description="security desc"
//		
//		)
		
public class OpenApiConfig {
	
}
