package com.everis.apibancoii.kafka;

import com.everis.apibancoii.controller.SaquesController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;
@Service
public class KafkaControleSaques {
    @Autowired
    private SaquesController quantsaques;

    @KafkaListener(topics = "CONTROLE_SAQUES", groupId = "CONTROLE_SAQUES")
    @SendTo
    public String listen(String numero){
        String mensagem = quantsaques.AlterarSaques(numero);
        System.out.println("Sacado com sucesso.");
        return "Operação realizada. " + mensagem ;
    }
}
