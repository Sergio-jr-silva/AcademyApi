package br.com.academyapi.academy.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funcionarioController {
    
    @GetMapping("/")
    public String Rota(){
        return "API DE FUNCIONARIO FUNCIONANDO!!!!";
    }
}
