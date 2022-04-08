package com.example.bootcamp.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
//http://localhost:8082/servicioRest/default url postman
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
