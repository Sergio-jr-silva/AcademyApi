package br.com.academyapi.academy.api.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Entity
@Component
@Table(name = "ItemTreino")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class itemTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

       
    @ManyToOne
    private Exercicios Exercicios;
 
    @Column
    private String repeticoes;

    @Column
    private String numeroSerie;

    @Column
    private String comentario;
}
