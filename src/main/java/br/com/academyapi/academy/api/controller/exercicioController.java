package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.academyapi.academy.api.Models.Exercicios;
import br.com.academyapi.academy.api.services.ExerciciosServico;

public class exercicioController {
    @Autowired
    private ExerciciosServico ex;

    @GetMapping("/exercicios")
    public String Home(){
        return("aqui vai ser o home do aluno!");
    } 

    @PostMapping("/exercicios/cadastrar")
    public Exercicios cadastrar(@RequestBody Exercicios exercicios){
      return ex.save(exercicios);
    }
  
}
