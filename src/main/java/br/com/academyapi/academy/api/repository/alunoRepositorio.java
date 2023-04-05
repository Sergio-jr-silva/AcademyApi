package br.com.academyapi.academy.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academyapi.academy.api.modelo.Aluno;

@Repository
public interface alunoRepositorio  extends CrudRepository<Aluno, Long>{
    
}
