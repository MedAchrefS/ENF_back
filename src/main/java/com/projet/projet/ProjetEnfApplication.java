package com.projet.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProjetEnfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetEnfApplication.class, args);
	}

}
