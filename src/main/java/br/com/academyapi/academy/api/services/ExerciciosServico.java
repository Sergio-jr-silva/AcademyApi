package br.com.academyapi.academy.api.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.Models.Exercicios;
import br.com.academyapi.academy.api.Models.Treino;
import br.com.academyapi.academy.api.repository.ExerciciosRepositorio;

@Service
public class ExerciciosServico {

    @Autowired
    private ExerciciosRepositorio ex;


    public Exercicios save(Exercicios exercicio) {
        return ex.save(exercicio);
    }


    public Iterable<Exercicios> listarTodos() {
  
        return ex.findAll();
    }


}
