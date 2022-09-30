package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
	
	@GetMapping
	public String bsm() {
		return "Mentalidades:"
				+ "<br>Orientação ao futuro "
				+ "<br>Mentalidade de crescimento "
				+ "<br>Mentalidade de persistência"
				+ "<br>Responsabilidade pessoal"
				+ "<br><br>Competências comportamentais:"
				+ "<br>Comunicação"
				+ "<br>Proatividade"
				+ "<br>Trabalho em equipe"
				+ "<br>Orientação ao detalhe";
	
	}
}
