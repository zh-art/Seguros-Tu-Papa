package com.segurostupapa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SegurosTuPapaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegurosTuPapaApplication.class, args);
	}


}
