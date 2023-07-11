package br.com.academyapi.academy.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.academyapi.academy.api.Models.Treino;
import br.com.academyapi.academy.api.Models.itemTreino;
import br.com.academyapi.academy.api.build.itemTreinoRequest;
import br.com.academyapi.academy.api.services.itemTreinoServico;
import br.com.academyapi.academy.api.services.treinoServico;


@RestController
@CrossOrigin
@RequestMapping("/treino")
public class treinoController {
    
    @Autowired
    private treinoServico tr;

    @Autowired
    private itemTreinoServico itemTreinoServico;


    @PostMapping("/item-treino")
   public ResponseEntity<itemTreino> save(@RequestBody @Valid itemTreinoRequest request) {

       itemTreino NovoitemTreino = request.build();
       NovoitemTreino.setExercicios(itemTreinoServico.obterPorID(request.getIdExercicio()));
       itemTreinoServico.save(NovoitemTreino);
       return new ResponseEntity<itemTreino>(NovoitemTreino, HttpStatus.CREATED);
   }

 

    @GetMapping
    public Iterable<Treino> listar(){
      return tr.listar();
    }

  
    
  
    @PostMapping
    public Treino cadastrar(@RequestBody Treino treino){
      return tr.save(treino);
    }
  
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Treino> remover(@PathVariable long id){
      return tr.remover(id);
    } 
      
}
