package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.Models.Funcionario;
import br.com.academyapi.academy.api.services.funcionarioServico;

@RestController
@CrossOrigin
public class funcionarioController {
    @Autowired
    private funcionarioServico fs;


@GetMapping("/funcionario")
public String Home(){
  return "Olá";
}

    @GetMapping("/funcionario/lista")
    public Iterable<Funcionario> listar(){
      return fs.listar();
    }
   
    @PostMapping("/funcionario/cadastrar")
    public Funcionario cadastrar( @RequestBody Funcionario funcionario){
      return fs.save(funcionario);
    }

    @DeleteMapping("/funcionario/deletar/{id}")
  public ResponseEntity<Funcionario> remover(@PathVariable long id){
    return fs.remover(id);
  } 
}
