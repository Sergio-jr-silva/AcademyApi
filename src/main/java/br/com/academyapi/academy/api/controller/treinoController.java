package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.Models.Treino;
import br.com.academyapi.academy.api.services.treinoServico;

@RestController
public class treinoController {
    
    @Autowired
    private treinoServico tr;
  
    @GetMapping("/treino")
    public String Home(){
        return("aqui vai ser o home do aluno!");
    } 
  
    @GetMapping("/treino/dados")
    public Iterable<Treino> listar(){
      return tr.listar();
    }
    
  
    @PostMapping("/treino/cadastrar")
    public Treino cadastrar(@RequestBody Treino treino){
      return tr.save(treino);
    }
  

    @DeleteMapping("/treino/deletar/{id}")
    public ResponseEntity<Treino> remover(@PathVariable long id){
      return tr.remover(id);
    } 
      
}
