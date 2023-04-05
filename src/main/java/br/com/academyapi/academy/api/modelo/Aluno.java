package br.com.academyapi.academy.api.modelo;

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
    private String genero;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String email;

    @Column
    private int telefone;

    @Column
    private double altura;

    @Column
    private double peso;

    @Column
    private String planoTreino;

    @Column
    private String tipoPagamento;

    public Iterable<Aluno> findAll() {
        return null;
    }
    

}