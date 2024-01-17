package com.pedroluizforlan.springdataJPAprojectpractice.service;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.Aluno;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.AvaliacaoFisica;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.AlunoForm;

import java.util.List;

public interface IAlunoService {

    /**
     * Cria um Aluno e salva no banco de dados.
     * @param alunoForm - formulário referente aos dados para criação do Aluno no banco de dados.
     * @return - Aluno recém-criado.
     */
    Aluno create(AlunoForm alunoForm);

    /**
     * Retorna um Aluno que está no banco de dados de acordo com o seu ID.
     * @param id - ID do Aluno que será exibido.
     * @return - Aluno de acordo com o ID fornecido.
     */
    Aluno get(Long id);

    /**
     * Método que retorna todos os Alunos do banco de dados.
     * @return - Lista com todos os Alunos que estão salvas no banco de dados.
     */
    List<Aluno> getAll();

    /**
     * Deleta um Aluno no banco de dados com base no ID
     * @param id - ID referente ao Aluno que deve ser removido do banco de dados.
     */
    void delete(Long id);

    /**
     * Retorna a lista de avaliações fisicas do Aluno
     * @param id - ID referente ao Aluno com uma lista de avaliações físicas.
     */
    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
