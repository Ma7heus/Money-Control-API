package com.matheusbiasi.moneycontroll.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "MONEYCONTROL_TRANSACAO")
public class Transacao implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENERATOR_IDTRANSACAO")
	@SequenceGenerator(allocationSize = 1, name = "GENERATOR_IDTRANSACAO", sequenceName = "IDTRANSACAO")
	private Long idTransacao;
	
	private String data;
	
	private String Categoria;
	
	private String titulo;
	
	private BigDecimal valor;
	
	private String origem;

	public Long getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(Long idTransacao) {
		this.idTransacao = idTransacao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
}
