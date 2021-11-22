package com.cesarplusplus.cesar_mm.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesarplusplus.cesar_mm.domain.Professor;
import com.cesarplusplus.cesar_mm.repository.ProfessorRepository;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository professorRepository;

	@PostMapping
	public Professor inserir(@RequestBody Professor professor) {
		Professor professorSalvo = professorRepository.save(professor);
		return professorSalvo;
	}

	@PutMapping
	public Professor alterar(@RequestBody Professor professor) {
		Professor professorSalvo = new Professor();
		if(professor.getId() > 0)
			professorSalvo = professorRepository.save(professor);
		return professorSalvo;
	}

	@GetMapping
	public List<Professor> listar(){
		return professorRepository.findAll();
	}


}
