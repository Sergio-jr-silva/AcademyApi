package br.com.academyapi.academy.api.Models;
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
@Table(name = "ItemTreino")
@Getter
@Setter
public class itemTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

       
     @ManyToOne
     @JoinColumn(name = "exercicios_id")
     private Exercicios exercicios;

       @ManyToOne
     @JoinColumn(name = "treino")
     private treino treino;

    @Column
    private String repeticoes;

    @Column
    private String numeroSerie;

    @Column
    private String comentario;
}
