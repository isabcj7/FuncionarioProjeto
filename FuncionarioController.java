package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Funcionario;
import com.example.demo.services.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

	private FuncionarioService funcionarioService;

	   @Autowired
	   public FuncionarioController(FuncionarioService funcionarioService) {
	       this.funcionarioService = new FuncionarioService(null);
		this.funcionarioService = funcionarioService;
	   }
	   
	   @PostMapping("/create")
	   public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
	       return FuncionarioService.saveFuncionario(funcionario);
	   }
	   
	   @GetMapping("/{id}")
	   public Funcionario getFuncionario(@PathVariable Long id) {
	       return funcionarioService.findFuncionarioById(id);
	   }
	   
	   @GetMapping("/all")
	   public List<Funcionario> getAllFuncionarios(){
	       return funcionarioService.findAllFuncionarios();
	   }
}
