package br.com.academyapi.academy.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academyapi.academy.api.Models.Exercicios;

@Repository
public interface ExerciciosRepositorio  extends CrudRepository<Exercicios, Long>{
    
}
