package com.cesarplusplus.cesar_mm.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarplusplus.cesar_mm.domain.Turma;
import com.cesarplusplus.cesar_mm.repository.TurmaRepository;

@RestController
@RequestMapping("/turma")
public class TurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;

	@PostMapping
	public Turma inserir(@RequestBody Turma turma) {
		Turma turmaSalva = turmaRepository.save(turma);
		return turmaSalva;
	}

	@PutMapping
	public Turma alterar(@RequestBody Turma turma) {
		Turma turmaAlterada = new Turma();
		if(turma.getId() > 0)
			turmaAlterada = turmaRepository.save(turma);
		return turmaAlterada;
	}

	@GetMapping
	public List<Turma> listar(){
		return turmaRepository.findAll();
	}


}
