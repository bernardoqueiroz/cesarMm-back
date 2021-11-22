package com.cesarplusplus.cesar_mm.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarplusplus.cesar_mm.domain.Disciplina;
import com.cesarplusplus.cesar_mm.repository.DisciplinaRepository;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@PostMapping
	public Disciplina inserir(@RequestBody Disciplina disciplina) {
		Disciplina disciplinaSalva = disciplinaRepository.save(disciplina);
		return disciplinaSalva;
	}

	@PutMapping
	public Disciplina alterar(@RequestBody Disciplina disciplina) {
		Disciplina disciplinaAlterada = new Disciplina();
		if(disciplina.getId() > 0)
			disciplinaAlterada = disciplinaRepository.save(disciplina);
		return disciplinaAlterada;
	}

	@GetMapping
	public List<Disciplina> listar(){
		return disciplinaRepository.findAll();
	}

}
