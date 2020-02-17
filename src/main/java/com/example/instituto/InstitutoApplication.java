package com.example.instituto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class InstitutoApplication {
    public static void main(String[] args) {
        SpringApplication.run(InstitutoApplication.class, args);
	}
}

@RestController
class HelloController{

	@GetMapping(value="/")
	String hello(){
		return "Hola esta es la API del Instituto";
	}

}
