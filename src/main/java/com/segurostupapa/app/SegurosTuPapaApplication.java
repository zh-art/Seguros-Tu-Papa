package com.segurostupapa.app;

import com.segurostupapa.app.Product.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SegurosTuPapaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegurosTuPapaApplication.class, args);
	}


}
