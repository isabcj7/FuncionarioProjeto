package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
private final FuncionarioRepository funcionarioRepository;
	
	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario findFuncionarioById1(Long id) {
		Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
		return funcionario.orElse(null);
	}
	
	public List<Funcionario> findAllFuncionarios1() {
		return funcionarioRepository.findAll();
	}
	
	public Funcionario saveAluno(Funcionario funcionario) {
		CrudRepository<Funcionario, Long> funcionariosRepository = null;
		return funcionariosRepository.save(funcionario);
	}

	public static Funcionario saveFuncionario(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Funcionario findFuncionarioById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Funcionario> findAllFuncionarios() {
		// TODO Auto-generated method stub
		return null;
	}

}
