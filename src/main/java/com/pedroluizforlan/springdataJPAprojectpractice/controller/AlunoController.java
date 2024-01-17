package com.pedroluizforlan.springdataJPAprojectpractice.controller;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Aluno;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.AvaliacaoFisica;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.AlunoForm;
import com.pedroluizforlan.springdataJPAprojectpractice.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
      return service.getAll();
    }

    @GetMapping("/id={id}")
    public Aluno get(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm alunoForm) {
       return service.create(alunoForm);
    }

    @DeleteMapping("/delete={id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }
}
