package br.com.academyapi.academy.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.Models.Aluno;
import br.com.academyapi.academy.api.services.AlunoServico;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin
@RequestMapping("/aluno")
public class alunoController {
   
  @Autowired
  private AlunoServico al;

  @GetMapping
  public Iterable<Aluno> listar(){
    return al.listar();
  }
  

  @PostMapping
  public Aluno cadastrar(@RequestBody @Valid Aluno aluno){
    return al.save(aluno);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Aluno> remover(@PathVariable long id){
    return al.remover(id);
  } 
    

}
