package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Projeto;
import com.example.demo.repositories.ProjetoRepository;

@Service
public class ProjetoService {
	

	private ProjetoRepository projetoRepository;

	@Autowired
	public ProjetoService(ProjetoRepository projetoRepository) {
		this.projetoRepository = projetoRepository;
	}
	
	public Projeto findProjetoById1(Long id) {
		Optional<Projeto> projeto = projetoRepository.findById(id);
		return projeto.orElse(null);
	}
	
	public List<Projeto> findAllProjetos1() {
		return projetoRepository.findAll();
	}
	
	public Projeto saveCurso(Projeto projeto) {
		return projetoRepository.save(projeto);
	}

	public Projeto saveProjeto(Projeto projeto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Projeto findProjetoById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Projeto> findAllProjetos() {
		// TODO Auto-generated method stub
		return null;
	}

}
