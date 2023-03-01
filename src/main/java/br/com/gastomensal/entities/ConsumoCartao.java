package br.com.gastomensal.entities;

import java.math.BigDecimal;

public class ConsumoCartao {

	private Long id;

	private String data;

	private String categoria;

	private String nomeEstabelecimento;

	private BigDecimal valorTransacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNomeEstabelecimento() {
		return nomeEstabelecimento;
	}

	public void setNomeEstabelecimento(String nomeEstabelecimento) {
		this.nomeEstabelecimento = nomeEstabelecimento;
	}

	public BigDecimal getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(BigDecimal valorTransacao) {
		this.valorTransacao = valorTransacao;
	}

	@Override
	public String toString() {
		return "ConsumoCartao [id=" + id + ", data=" + data + ", categoria=" + categoria + ", nomeEstabelecimento="
				+ nomeEstabelecimento + ", valorTransacao=" + valorTransacao + "]";
	}

}
