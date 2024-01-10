package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//define como controller
@RestController
//mapeia as solicitacoes para o endereco da requisicao /olamundo
@RequestMapping("/olamundo") // endpoint raiz

public class OlaMundoController {

	@GetMapping
	public String olamundo() {
		return "Hello World!";
	}

	@GetMapping("/BSM") // endpoint filho
	public String BSM() {
		return "As BSM's da Generation são: Comunicação, proatividade, orientação ao detalhe, trabalho em equipe, "
				+ "mentalidade de crescimento, orientação ao futuro, responsabilidade pessoal e persistência";
	}

	@GetMapping("/aprendizagem") // endpoint filho
	public String mundo() {
		return " Os meus objetivos de aprendizagem desta semana foram: Comunicação e proatividade ";
	}

}
