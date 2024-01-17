package com.pedroluizforlan.springdataJPAprojectpractice.service.impl;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Aluno;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.AvaliacaoFisica;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.AvaliacaoFisicaForm;
import com.pedroluizforlan.springdataJPAprojectpractice.repository.AlunoRepository;
import com.pedroluizforlan.springdataJPAprojectpractice.repository.AvaliacaoFisicaRepository;
import com.pedroluizforlan.springdataJPAprojectpractice.service.IAvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoService{

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm avaliacaoFisicaForm) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(avaliacaoFisicaForm.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(avaliacaoFisicaForm.getPeso());
        avaliacaoFisica.setAltura(avaliacaoFisicaForm.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
