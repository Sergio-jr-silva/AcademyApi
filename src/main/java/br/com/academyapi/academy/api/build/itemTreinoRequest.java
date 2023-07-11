package br.com.academyapi.academy.api.build;

import br.com.academyapi.academy.api.Models.itemTreino;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class itemTreinoRequest {

    private Long IdExercicio;

     private String repeticoes;

     private String numeroSerie;

     private String comentario;


     public itemTreino build() {

        itemTreino item = itemTreino.builder()
            .repeticoes(repeticoes)
            .numeroSerie(numeroSerie)
            .comentario(comentario)
            .build();

        return item;
    }

}
