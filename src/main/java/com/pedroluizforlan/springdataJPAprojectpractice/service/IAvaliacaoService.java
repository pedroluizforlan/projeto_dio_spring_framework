package com.pedroluizforlan.springdataJPAprojectpractice.service;

import com.pedroluizforlan.springdataJPAprojectpractice.entity.AvaliacaoFisica;
import com.pedroluizforlan.springdataJPAprojectpractice.entity.form.AvaliacaoFisicaForm;

import java.util.List;

public interface IAvaliacaoService {
    /**
     * Cria uma Avaliação Física e salva no banco de dados
     * @param avaliacaoFisicaForm - formulário referente aos dados para criação da Avaliação Física no banco de dados.
     * @return - Avaliação Física recém-criada
     */
    AvaliacaoFisica create(AvaliacaoFisicaForm avaliacaoFisicaForm);

    /**
     * Retorna uma Avaliação Física que está no banco de dados de acordo com o seu ID.
     * @param id - ID da  Avaliação Física que será exibida.
     * @return - Avaliação Física de acordo com o ID fornecido.
     */
    AvaliacaoFisica get(Long id);

    /**
     * Método que retorna todas as Avaliações Físicas do banco de dados.
     * @return - Lista com todas as Avaliações Físicas que estão salvas no banco de dados.
     */
    List<AvaliacaoFisica> getAll();

    /**
     * Deleta uma Avaliações Físicas no banco de dados com base no ID
     * @param id - ID referente a Avaliações Físicas que deve ser removida do banco de dados.
     */
    void delete(Long id);
}
