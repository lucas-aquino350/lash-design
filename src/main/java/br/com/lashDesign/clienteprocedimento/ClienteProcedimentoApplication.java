package br.com.lashDesign.clienteprocedimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteProcedimentoApplication {

	@GetMapping
	public String getHomeTeste() {
		return "API - LASH DESIGN";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ClienteProcedimentoApplication.class, args);
	}
}