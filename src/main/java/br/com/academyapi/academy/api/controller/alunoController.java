package br.com.academyapi.academy.api.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class alunoController {
    @GetMapping("/aluno")
    public String Rota(){
        return "API DE Alunos FUNCIONANDO!!!!";
    }
}
