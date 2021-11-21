package com.cesarplusplus.cesar_mm.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarplusplus.cesar_mm.domain.Aluno;
import com.cesarplusplus.cesar_mm.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@PostMapping
	public Aluno inserir(@RequestBody Aluno aluno) {
		Aluno alunoSalvo = alunoRepository.save(aluno);
		return alunoSalvo;
	}
}
