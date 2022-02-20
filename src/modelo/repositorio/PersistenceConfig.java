package modelo.repositorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence; //Abstrai a chamada aos frameworks ORM que configuramos no persistence.xml

public class PersistenceConfig {
	//Permite a criação de um EntityManager baseado em uma persistence unit do persistence.xml (static pois um unico objeto pode criar quantas entities quiser)
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HibernateDatabase");
	
	//Objeto que vamos acessar cada entidade
	private static EntityManager entityManager;
	
	//EntityManager instanciado no método get
	public static EntityManager getEntityManager() {
		if(entityManager == null) {
			try {
				entityManager = entityManagerFactory.createEntityManager();
				System.out.println("Gerenciador de entidades instanciado com sucesso");
			} catch (Exception e) {
				System.out.println("Erro ao instanciar Gerenciador de entidades " + e.getMessage());
			}
		}
		return entityManager;
	}
	
	//Sempre que não precisamos mais de conexão com o BDD, fechamos o entitymanager
	public static void closeEntityManager() {
		if(entityManager != null) {
			try {
				entityManager.close();
				entityManager = null;
				System.out.println("Gerenciador de entidades fechado com sucesso");
			} catch (Exception e) {
				System.out.println("Erro ao fechar Gerenciador de entidades" + e.getMessage());
			}
		}
	}
}
