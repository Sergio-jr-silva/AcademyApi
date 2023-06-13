package br.com.academyapi.academy.api.Models;

import java.time.LocalDate;

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
@Table(name = "Alunos")
@Getter
@Setter
public class Aluno{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private long Id;

    @Column
    private String nome;

    @Column
    private String sobrenome;

    @Column
    private String genero;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String email;

    @Column
    private String telefone;

    @Column
    private double altura;

    @Column
    private double peso;

    @Column
    private int Idade;

    @Column
    private int senha;


}

