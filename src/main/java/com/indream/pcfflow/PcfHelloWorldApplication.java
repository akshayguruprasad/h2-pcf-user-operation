package com.indream.pcfflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class PcfHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcfHelloWorldApplication.class, args);
	}

}
