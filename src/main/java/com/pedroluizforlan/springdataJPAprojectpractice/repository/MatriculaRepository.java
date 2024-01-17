package com.pedroluizforlan.springdataJPAprojectpractice.repository;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
