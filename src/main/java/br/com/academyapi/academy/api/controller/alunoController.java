package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.modelo.Aluno;
import br.com.academyapi.academy.api.services.AlunoServico;

@RestController
public class alunoController {
   
  @Autowired
  private AlunoServico al;

  @PostMapping("/aluno/cadastrar")
  public Aluno cadastrar(@RequestBody Aluno aluno){
    return al.save(aluno);
  }
    
}
