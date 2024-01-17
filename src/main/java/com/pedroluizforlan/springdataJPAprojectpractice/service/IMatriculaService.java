package com.pedroluizforlan.springdataJPAprojectpractice.service;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Matricula;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    /**
     * Cria uma Mátricula e salva no banco de dados.
     * @param matriculaForm - formulário referente aos dados para criação da Matricula no banco de dados.
     * @return - Matrícula recém-criada
     */
    Matricula create(MatriculaForm matriculaForm);

    /**
     * Retorna uma Matrícula que está no banco de dados de acordo com o seu ID.
     * @param id - ID da Matrícula que será exibida.
     * @return - Matricula de acordo com o ID fornecido.
     */
    Matricula get(Long id);

    /**
     * Método que retorna todas as matrículas do banco de dados.
     * @return - Lista com todas as matrículas que estão salvas no banco de dados.
     */
    List<Matricula> getAll();

    /**
     * Deleta uma Mátricula no banco de dados com base no ID
     * @param id - ID referente a Matricula que deve ser removida do banco de dados.
     */
    void delete(Long id);
}
