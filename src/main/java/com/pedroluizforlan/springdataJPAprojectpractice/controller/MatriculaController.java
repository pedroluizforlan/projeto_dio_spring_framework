package com.pedroluizforlan.springdataJPAprojectpractice.controller;



import com.pedroluizforlan.springdataJPAprojectpractice.entity.Matricula;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.MatriculaForm;
import com.pedroluizforlan.springdataJPAprojectpractice.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl matriculaService;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm matriculaForm) {
        return matriculaService.create(matriculaForm);
    }

    @GetMapping("/id={id}")
    public Matricula get(@PathVariable Long id){
        return matriculaService.get(id);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return matriculaService.getAll();
    }

    @DeleteMapping("/delete={id}")
    public void delete(@PathVariable Long id){
        matriculaService.delete(id);
    }
}
