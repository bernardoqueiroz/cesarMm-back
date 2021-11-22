package com.cesarplusplus.cesar_mm.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarplusplus.cesar_mm.domain.Aluno;
import com.cesarplusplus.cesar_mm.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@PostMapping
	public Aluno inserir(@RequestBody Aluno aluno) {
		Aluno alunoSalvo = alunoRepository.save(aluno);
		return alunoSalvo;
	}

	@PutMapping
	public Aluno alterar(@RequestBody Aluno aluno) {
		Aluno alunoAlterado = new Aluno();
		if(aluno.getId() > 0) {
			alunoAlterado = alunoRepository.save(aluno);
		}
		return alunoAlterado;
		
	}

	@GetMapping
	public List<Aluno> listar(){
		return alunoRepository.findAll();
	}


}
