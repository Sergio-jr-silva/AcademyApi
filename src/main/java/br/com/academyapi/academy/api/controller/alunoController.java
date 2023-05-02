package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.modelo.Aluno;
import br.com.academyapi.academy.api.services.AlunoServico;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class alunoController {
   
  @Autowired
  private AlunoServico al;

  @GetMapping("/aluno")
  public String Home(){
      return("aqui vai ser o home do aluno!");
  } 

  @GetMapping("/aluno/dados")
  public Iterable<Aluno> listar(){
    return al.listar();
  }
  

  @PostMapping("/aluno/cadastrar")
  public Aluno cadastrar(@RequestBody Aluno aluno){
    return al.save(aluno);
  }

    

}
