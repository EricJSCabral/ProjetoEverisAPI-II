package com.everis.apibancoii.repository;

import com.everis.apibancoii.model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ContaRepository extends JpaRepository<ContaModel, Integer> {
    Optional <ContaModel> findByNumero(String numero);
}
