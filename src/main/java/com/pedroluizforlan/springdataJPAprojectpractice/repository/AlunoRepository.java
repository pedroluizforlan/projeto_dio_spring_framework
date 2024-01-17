package com.pedroluizforlan.springdataJPAprojectpractice.repository;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
