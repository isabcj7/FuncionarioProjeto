package com.example.demo.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomeFuncionario;
	
	@ManyToMany(fetch = FetchType.LAZY) //criacao da tabela de juncao - sem mapeamento
	@JoinTable(name = "tb_funcionario_projeto", //nome da tabela
	joinColumns = @JoinColumn(name = "funcionario_id"), 
	inverseJoinColumns = @JoinColumn(name = "projeto_id")) 
	private List<Projeto> projeto; 
	
	//construtores
	private Funcionario () {
		
	}

	public Funcionario(Long id, String nomeFuncionario, List<Projeto> projeto) {
		super();
		this.id = id;
		this.nomeFuncionario = nomeFuncionario;
		this.projeto = projeto;
	}

	//metodos get e set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeFuncionario = nomeAluno;
	}

	public List<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(List<Projeto> projeto) {
		this.projeto = projeto;
	}
	
}
