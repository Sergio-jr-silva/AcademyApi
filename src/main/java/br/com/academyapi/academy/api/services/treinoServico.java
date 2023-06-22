package br.com.academyapi.academy.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.Models.Exercicios;
import br.com.academyapi.academy.api.Models.Treino;
import br.com.academyapi.academy.api.repository.ExerciciosRepositorio;
import br.com.academyapi.academy.api.repository.treinoRepositorio;

@Service
public class treinoServico {
    
    @Autowired
    private treinoRepositorio tr;


    //Método Para Listar
    public Iterable<Treino> listar(){
        return tr.findAll();
    }

    //salvar treino
    public Treino save(Treino treino) {
        return tr.save(treino);
    }

    //remover treinos
    public ResponseEntity<Treino> remover(long id){
        tr.findById(id);
        return new ResponseEntity<Treino>(HttpStatus.OK);
    }

   
    
}
