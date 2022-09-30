package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return "Objetivos de aprendizagem para essa semana:<br>" + "<br>Organização de tarefas e horários."
				+ "<br>Planejamento." + "<br>Pesquisa complementar do assunto passado em Live." + "<br>Prática."
				+ "<br>Persistência!!!";

	}

}
