package br.com.gastomensal.JPA;


import java.math.BigDecimal;



import br.com.gastomensal.entities.ConsumoCartao;
import jakarta.persistence.EntityManager;

public class JpaUtil {
	
	ConsumoCartao consumoCartao =  new ConsumoCartao(
			"teste",
			"teste",
			"teste",
			new BigDecimal(1));

	public static void pesist(ConsumoCartao consumoCartao) throws Exception{
		getEm().getTransaction().begin();
		getEm().persist(consumoCartao);
		getEm().getTransaction().commit();
		getEm().close();
		System.out.println("Salvo com sucesso");
	}

	private static EntityManager getEm() {
		EntityManagerFactoryUtil em = new EntityManagerFactoryUtil();
		return em.createEntityManager();
	}
	
	public static void main(String[] args) throws Exception {
		
		ConsumoCartao consumoCartao =  new ConsumoCartao(
				"teste",
				"teste",
				"teste",
				new BigDecimal(1));
		
		getEm().persist(consumoCartao);
	
	}
	
	
	

	
}

 
