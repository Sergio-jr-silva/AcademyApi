package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.academyapi.academy.api.modelo.Aluno;
import br.com.academyapi.academy.api.services.AlunoServico;


public class alunoController {
   
  @Autowired
  private AlunoServico al;
  @PostMapping("/cadastro")
  public ResponseEntity<?> cadastrar(@RequestBody Aluno al)  {
    return al.cadastrar(al);
    
}
    
}
