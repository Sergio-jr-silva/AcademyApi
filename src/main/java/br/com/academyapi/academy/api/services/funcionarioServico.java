package br.com.academyapi.academy.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.Models.Funcionario;
import br.com.academyapi.academy.api.repository.funcionarioRepositorio;

@Service
public class funcionarioServico {
    
    @Autowired
    private funcionarioRepositorio pr;

    //Método Para Listar
    public Iterable<Funcionario> listar(){
        return pr.findAll();
    }

    public Funcionario save(Funcionario funcionario) {
        return pr.save(funcionario);
    }

    public ResponseEntity<Funcionario> remover(long id){
        pr.deleteById(id);
        return new ResponseEntity<Funcionario>(HttpStatus.OK);
    }
  

}
