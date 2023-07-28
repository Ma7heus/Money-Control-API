package com.matheusbiasi.moneycontroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusbiasi.moneycontroll.model.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
