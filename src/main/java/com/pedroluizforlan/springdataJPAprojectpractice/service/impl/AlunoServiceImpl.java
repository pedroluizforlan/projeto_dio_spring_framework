package com.pedroluizforlan.springdataJPAprojectpractice.service.impl;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Aluno;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.AvaliacaoFisica;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.AlunoForm;
import com.pedroluizforlan.springdataJPAprojectpractice.repository.AlunoRepository;
import com.pedroluizforlan.springdataJPAprojectpractice.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm alunoForm) {
        Aluno aluno = new Aluno();
        aluno.setNome(alunoForm.getNome());
        aluno.setCpf(alunoForm.getCpf());
        aluno.setBairro(alunoForm.getBairro());
        aluno.setDataDeNascimento(alunoForm.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        Aluno aluno = alunoRepository.getReferenceById(id);
        return aluno;
    }

    @Override
    public List<Aluno> getAll() {
       return alunoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        alunoRepository.deleteById(id);
    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacaoFisica();
    }
}
