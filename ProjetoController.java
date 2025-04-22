package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entities.Projeto;
import com.example.demo.services.ProjetoService;

public class ProjetoController {

private final ProjetoService projetoService;
	
	@Autowired
	public ProjetoController (ProjetoService projetoService) {
		this.projetoService = projetoService;
	}
	
	@PostMapping("/create")
	public Projeto createProjeto( @RequestBody Projeto projeto) {
		return projetoService.saveProjeto(projeto);
	}
	
	@GetMapping("/{id}")
	public Projeto getProjeto( @PathVariable Long id) {
		return projetoService.findProjetoById(id);
	}
	
	@GetMapping("/all")
	public List<Projeto> getAllProjetos() {
		return projetoService.findAllProjetos();
	}
}