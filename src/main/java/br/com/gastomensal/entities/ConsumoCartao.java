package br.com.gastomensal.entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;


@Entity
public class ConsumoCartao {

	@Id
	@SequenceGenerator(name = "SEQUENCE_CONSUMO_CARTAO", sequenceName = "IDCONSUMOCARTAO", allocationSize = 1)
	@GeneratedValue(generator = "SEQUENCE_CONSUMO_CARTAO", strategy = GenerationType.SEQUENCE)
	private Long idConsumoCartao;

	private String data;

	private String categoria;

	private String nomeEstabelecimento;

	private BigDecimal valorTransacao;

	public ConsumoCartao() {
	}

	public ConsumoCartao(String data, String categoria, String nomeEstabelecimento,
			BigDecimal valorTransacao) {
		this.data = data;
		this.categoria = categoria;
		this.nomeEstabelecimento = nomeEstabelecimento;
		this.valorTransacao = valorTransacao;
	}

	public Long getIdConsumoCartao() {
		return idConsumoCartao;
	}

	public void setIdConsumoCartao(Long idConsumoCartao) {
		this.idConsumoCartao = idConsumoCartao;
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
		return "ConsumoCartao [idConsumoCartao=" + idConsumoCartao + ", data=" + data + ", categoria=" + categoria
				+ ", nomeEstabelecimento=" + nomeEstabelecimento + ", valorTransacao=" + valorTransacao + "]";
	}

}
