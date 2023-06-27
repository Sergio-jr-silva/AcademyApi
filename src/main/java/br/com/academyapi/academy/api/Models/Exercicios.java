package br.com.academyapi.academy.api.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Entity
@Component
@Table(name = "Exercicios")
@Getter
@Setter
public class Exercicios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private String Nome;

  
}
