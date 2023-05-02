package br.com.academyapi.academy.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.modelo.Aluno;
import br.com.academyapi.academy.api.repository.alunoRepositorio;
@Service
public class AlunoServico {
    @Autowired
    private alunoRepositorio al;

    //Método Para Listar
    public Iterable<Aluno> listar(){
        return al.findAll();
    }

    public Aluno save(Aluno aluno) {
        return al.save(aluno);
    }

    public ResponseEntity<Aluno> remover(long id){
        al.findById(id);
        return new ResponseEntity<Aluno>(HttpStatus.OK);
    }
}
