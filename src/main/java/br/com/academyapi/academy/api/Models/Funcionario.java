package br.com.academyapi.academy.api.Models;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Component
@Getter
@Setter
@Table(name = "Funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long Id;

    @Column
    private String nome;

    @Column
    private String genero;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @Column
    private String email;

    @Column
    private int telefone;

    @Column
    private double salario;

    @Column
    private String cargo;

    @Column
    private LocalDate dataAdmissao;

    @Column
    private String funcao;

    @Column
    private String formacao;

    @Column
    private String certificacao;
}
