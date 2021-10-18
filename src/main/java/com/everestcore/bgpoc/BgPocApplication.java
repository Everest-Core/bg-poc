package com.everestcore.bgpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.everestcore"})
public class BgPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgPocApplication.class, args);
	}

}
