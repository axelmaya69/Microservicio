package com.microservice.eureka.micoservicio_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicoservicioEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicoservicioEurekaApplication.class, args);
	}

}
