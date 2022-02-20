package modelo.repositorio;

import javax.persistence.EntityTransaction;

public class Repositorio<T>{
	
	public boolean criar(T entidade) {
		boolean resultado = true;
		
		//Classe responsável por realizar as operações
		EntityTransaction transacao = PersistenceConfig.getEntityManager().getTransaction();
		
		try {
			transacao.begin();
			PersistenceConfig.getEntityManager().persist(entidade);
			transacao.commit();
		} catch (Exception e) {
			System.out.println("Erro ao criar entidade" + e.getMessage());
			transacao.rollback();
			resultado = false;
		}
		
		return resultado;
	}
}
