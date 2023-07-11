package br.com.academyapi.academy.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.Models.Exercicios;
import br.com.academyapi.academy.api.Models.itemTreino;
import br.com.academyapi.academy.api.repository.ExerciciosRepositorio;
import br.com.academyapi.academy.api.repository.itemTreinoRepositorio;



@Service
public class itemTreinoServico {

    @Autowired
    private itemTreinoRepositorio itemTreino;

    @Autowired
    private ExerciciosRepositorio ex;


    public itemTreino save(itemTreino item) {
        return itemTreino.save(item);
    }

    public Exercicios obterPorID(Long id) {
 
        return ex.findById(id).get();
    }
  

}
