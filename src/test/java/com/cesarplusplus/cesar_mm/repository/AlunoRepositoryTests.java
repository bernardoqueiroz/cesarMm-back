package com.cesarplusplus.cesar_mm.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cesarplusplus.cesar_mm.domain.Aluno;

@SpringBootTest
public class AlunoRepositoryTests {
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Test
	public void inserir() {
		Aluno a1 = new Aluno();
		a1.setId(null);
		a1.setNomeCompleto("Bernardo");
		
		Aluno a2 = new Aluno();
		a2.setId(null);
		a2.setNomeCompleto("Maria");
		
		alunoRepository.save(a1);
		alunoRepository.save(a2);
	}

}
