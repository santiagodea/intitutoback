package com.example.instituto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstitutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstitutoApplication.class, args);
	}

	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hola, esta es la API del Instituto";
    }

}
