package com.everis.apibancoii.controller;


import com.everis.apibancoii.model.ContaModel;
import com.everis.apibancoii.repository.ContaRepository;
import com.everis.apibancoii.service.SaquesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
public class SaquesController {

    @Autowired
    private SaquesService saquesService;

    @PostMapping(path = "/conta/{numero}")
    public String AlterarSaques(@PathVariable("numero") String numero) {
       return saquesService.AlterarSaques(numero);
    }
}
