package com.cesarplusplus.cesar_mm.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AlunoTests {
	
	@Test
	public void cadastar() {
		Aluno a = new Aluno();
		a.setNome("Bernardo");
		a.setSobrenome("Queiroz");
	}
}
