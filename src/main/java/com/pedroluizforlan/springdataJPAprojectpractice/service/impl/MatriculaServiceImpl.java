package com.pedroluizforlan.springdataJPAprojectpractice.service.impl;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Aluno;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.Matricula;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.MatriculaForm;
import com.pedroluizforlan.springdataJPAprojectpractice.repository.AlunoRepository;
import com.pedroluizforlan.springdataJPAprojectpractice.repository.MatriculaRepository;
import com.pedroluizforlan.springdataJPAprojectpractice.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm matriculaForm) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(matriculaForm.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.getById(id);
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
