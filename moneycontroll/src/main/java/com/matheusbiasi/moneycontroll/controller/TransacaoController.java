package com.matheusbiasi.moneycontroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusbiasi.moneycontroll.dto.TransacaoDTO;
import com.matheusbiasi.moneycontroll.model.Transacao;
import com.matheusbiasi.moneycontroll.service.GenericService;
import com.matheusbiasi.moneycontroll.service.TransacaoService;

@RestController
@RequestMapping("transacao")
public class TransacaoController extends AbstractController<Transacao, TransacaoDTO>{
	
	@Autowired
	private TransacaoService service;

	@Override
	public Class<Transacao> getModelClass() {
		return Transacao.class;
	}

	@Override
	public Class<TransacaoDTO> getDTOClass() {
		return TransacaoDTO.class;
	}

	@Override
	public GenericService<Transacao> getService() {
		return service;
	}

}
