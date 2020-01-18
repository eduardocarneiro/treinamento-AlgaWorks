package com.algaworks;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatosControle {

	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Eduardo", "+55 11 94286 9687"));
		LISTA_CONTATOS.add(new Contato("1", "Dezenatty", "+55 11 94286 9687"));
		LISTA_CONTATOS.add(new Contato("1", "Sarah", "+55 11 94286 9687"));
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
