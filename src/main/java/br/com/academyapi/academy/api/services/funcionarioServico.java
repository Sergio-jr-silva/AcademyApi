package br.com.academyapi.academy.api.services;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academyapi.academy.api.modelo.Funcionario;
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

    public java.util.List<Funcionario> findall() {
        return null;
    }

  

}
