package com.microservice.gateway.micoservicio_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MicoservicioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicoservicioGatewayApplication.class, args);
	}

}
