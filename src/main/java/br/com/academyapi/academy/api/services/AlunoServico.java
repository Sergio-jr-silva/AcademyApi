package br.com.academyapi.academy.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.modelo.Aluno;

@Service
public class AlunoServico {
    @Autowired
    private Aluno pr;

    //Método Para Listar
    public Iterable<Aluno> listar(){
        return pr.findAll();
    }
}
