package com.cesarplusplus.cesar_mm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarplusplus.cesar_mm.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Short> {

}
