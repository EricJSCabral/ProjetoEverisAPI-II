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
        ContaModel conta = repository.findByNumero(numero).orElseThrow(() -> new RuntimeException());
        conta.setSaques(conta.getSaques() + 1);
        repository.save(conta);
        return "Operação Realizada. " + ResponseEntity.ok().build();
        }
}
