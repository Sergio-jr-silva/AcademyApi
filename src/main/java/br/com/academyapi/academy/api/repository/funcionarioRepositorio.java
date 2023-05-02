package br.com.academyapi.academy.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academyapi.academy.api.modelo.Funcionario;

@Repository
public interface funcionarioRepositorio extends CrudRepository<Funcionario, Long>{
}
