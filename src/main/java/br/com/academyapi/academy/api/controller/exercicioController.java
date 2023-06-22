package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.Models.Exercicios;
import br.com.academyapi.academy.api.services.ExerciciosServico;


@RestController
@CrossOrigin
@RequestMapping("/exercicio")
public class exercicioController {
    @Autowired
    private ExerciciosServico ex;


    @PostMapping("/exercicios/cadastrar")
    public Exercicios cadastrar(@RequestBody Exercicios exercicios){
      return ex.save(exercicios);
    }
  
}
