package br.com.academyapi.academy.api.Models;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Entity
@Component
@Table(name = "Treinos")
@Getter
@Setter
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private long Id;

    @Column
    private String nomeTreino;

    @Column
    private String Frequencia;

    @Column
    private LocalDate dataInicio;

     @ManyToOne
     @JoinColumn(name = "itemTreino")
     private itemTreino itemTreino;
     
     private Long idItemTreino;
 
}
