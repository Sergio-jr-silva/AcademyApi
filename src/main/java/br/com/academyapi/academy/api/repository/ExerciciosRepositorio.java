package br.com.academyapi.academy.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.academyapi.academy.api.Models.Exercicios;

public interface ExerciciosRepositorio  extends CrudRepository<Exercicios, Long>{
    
}
