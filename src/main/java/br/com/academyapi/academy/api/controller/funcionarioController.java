package br.com.academyapi.academy.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.academyapi.academy.api.modelo.Funcionario;
import br.com.academyapi.academy.api.services.funcionarioServico;

@RestController
public class funcionarioController {
    @Autowired
    private funcionarioServico fs;


@GetMapping("/")
public String rota(){
  return "Olá";
}

    @GetMapping("/listar")
    public Iterable<Funcionario> listar(){
      return fs.listar();
    }
   
    @PostMapping("/cadastrar")
    public Funcionario cadastrar( @RequestBody Funcionario funcionario){
      return fs.save(funcionario);
    }
}
