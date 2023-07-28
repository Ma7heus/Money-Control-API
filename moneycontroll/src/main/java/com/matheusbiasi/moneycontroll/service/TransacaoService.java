package com.matheusbiasi.moneycontroll.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusbiasi.moneycontroll.model.Transacao;
import com.matheusbiasi.moneycontroll.repository.TransacaoRepository;

@Service
public class TransacaoService implements GenericService<Transacao>{
	
	@Autowired
	private TransacaoRepository transacaoRepository;

	@Override
	public Transacao save(Transacao model) {
		return transacaoRepository.save(model);
	}

	@Override
	public List<Transacao> findAll() {
		return transacaoRepository.findAll();
	}

	@Override
	public Optional<Transacao> findById(Long id) {
		return Optional.empty();
	}

	@Override
	public Transacao update(Transacao model) {
		if(Objects.isNull(model.getIdTransacao())) {
			throw new RuntimeException("Entidade " + model + "sem ID para atualizacao");
		}
		return transacaoRepository.save(model);
	}

	@Override
	public void delete(Long id) {
		transacaoRepository.deleteById(id);
	}

}
