package br.com.gastomensal.JPA;


import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.gastomensal.entities.ConsumoCartao;

public class JpaUtil {

	@PersistenceContext
	private static EntityManager em;
	
	ConsumoCartao consumoCartao =  new ConsumoCartao(
			"teste",
			"teste",
			"teste",
			new BigDecimal(1));

	public static void pesist(ConsumoCartao consumoCartao) {
		em.persist(consumoCartao);
		System.out.println("Salvo com sucesso");
	}
	
	
	public static void main(String[] args) {
		
		ConsumoCartao consumoCartao =  new ConsumoCartao(
				"teste",
				"teste",
				"teste",
				new BigDecimal(1));
		
		pesist(consumoCartao);
	
	}
	

	
}

 
