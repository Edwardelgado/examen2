package com.delgado.infraccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InfraccionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraccionApplication.class, args);
	}

}
