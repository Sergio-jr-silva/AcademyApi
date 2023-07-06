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

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



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
    @NotNull(message = "O Nome é de preenchimento obrigatório")
    @NotBlank(message = "O Nome é de preenchimento obrigatório")
    private String nome;

    @Column
     @NotNull(message = "Informe a data De nascimento")
    private LocalDate dataNascimento;

    @Column
     @NotNull(message = "informe O email")
    private String email;

    @Column
     @NotNull(message = "Informe o celular para contato")
    private String celular;

    @Column
     @NotNull(message = "Informe a sua altura")
    private double altura;

    @Column
     @NotNull(message = "Informe o seu peso")
    private double peso;

    @Column
    private String pagamento;

    @Column
    private String plano;

    @Column
     @NotNull(message = "Informe a data De nascimento")
    private int senha;


}

