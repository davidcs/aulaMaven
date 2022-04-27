package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Aplicacao {

	public static void main(String[] args) {
		//Pessoa	p1 = new Pessoa(null, "David Correia", "Testes@testes.com.br");
		//Pessoa	p2 = new Pessoa(null, "Carlos roberto", "Roberto@testes.com.br");
		//Pessoa	p3 = new Pessoa(null, "Rayane Grattz", "Grattz@testes.com.br");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//abrindo a conexão 
		//em.getTransaction().begin();
		
		//persistindo os dados no banco.
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		
		//Buscando Pessoa no Banco de dados.
		//Pessoa p = em.find(Pessoa.class, 1);
		//System.out.println(p);
		
		//Fechando a conexão 
		//em.getTransaction().commit();
		
		//Deletando Pessoa do Banco
		Pessoa p = em.find(Pessoa.class, 2);
		//abrindo a conexão 
		em.getTransaction().begin();
		//Executando a exclusão 
		em.remove(p);
		//Fechando a conexão
		em.getTransaction().commit();
		
		System.out.println("Pronto !!!");
		
		//Fechando o Entity Manager
		em.close();
	}

}
