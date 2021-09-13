package com.everis.apibancoii.service;

import com.everis.apibancoii.model.ContaModel;
import com.everis.apibancoii.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class SaquesService {

    @Autowired
    private ContaRepository repository;

    public String AlterarSaques(String numero){
        Optional<ContaModel> conta = repository.findByNumero(numero);
        if (conta.isPresent()) {
            conta.map(map -> {
                map.setSaques(map.getSaques() + 1);
                ContaModel c1 = repository.save(map);
                return ResponseEntity.ok().body(c1);
            });
            return "Operação Realizada. " + ResponseEntity.ok().build();
        }
        return "Não foi possóvel realizar a operação. " + ResponseEntity.badRequest().build();
    }
}
