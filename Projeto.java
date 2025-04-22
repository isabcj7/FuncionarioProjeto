package com.example.demo.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //ter independencia entre as tabelas
	private Long id;
	
	private String nomeProjeto;
	
	//fazer requisições a servidores
	@ManyToMany(mappedBy = "projeto", fetch = FetchType.LAZY) //classe curso vai cuidar da chave estrangeira
	private List<Funcionario> funcionario; //chamando/ligacao com a classe aluno

	//construtores
	
	//sem parametro
	public Projeto() {
		
	}
	
	//com parametro
	public Projeto(Long id, String nomeprojeto, List<Funcionario> funcionarios) {
		super();
		this.id = id;
		this.nomeProjeto = nomeProjeto;
		this.funcionario = funcionarios;
	}

	//metodos get e set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionario;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionario = funcionarios;
	}
	
	
	
	
	
}
