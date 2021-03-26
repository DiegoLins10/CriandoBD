import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AlunoDAO {

	public void insert(Aluno aluno) {
		// Criando uma conexão com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();     // inicio da transação

		entitymanager.persist(aluno);         		// gravar o aluno
		entitymanager.getTransaction().commit();	// fim da transação

		entitymanager.close();	// fechando o objeto para gerenciamento das entidades
		emfactory.close();      // fechando a conexão com o Banco de Dados		
	}
	

	public void delete(String id) {
		// Criando uma conexão com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("delete Aluno id");
		query.setParameter("ra", id);
		entitymanager.getTransaction().begin();   
		query.executeUpdate();
		entitymanager.getTransaction().commit();   
		entitymanager.close();	// fechando o objeto para gerenciamento das entidades
		emfactory.close();      // fechando a conexão com o Banco de Dados		
	}
	
	public void update(Aluno aluno) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		entitymanager.merge(aluno);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();		
	}

	public void updateQuery(Aluno aluno) {
		// Criando uma conexão com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("update Aluno query");
		query.setParameter("ra", aluno.getRa());
		query.setParameter("n", aluno.getNome());
		query.setParameter("e", aluno.getEmail());
		query.setParameter("c", aluno.getCelular());
		query.setParameter("n1", aluno.getNota1());
		query.setParameter("n2", aluno.getNota2());
		entitymanager.getTransaction().begin();   
		query.executeUpdate();
		entitymanager.getTransaction().commit();   
		entitymanager.close();	// fechando o objeto para gerenciamento das entidades
		emfactory.close();      // fechando a conexão com o Banco de Dados		
	}

	public Aluno find(String ra) {
		// Criando uma conexão com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("find Aluno id");
		query.setParameter("ra", ra);
		Aluno aluno = (Aluno) query.getSingleResult();

		entitymanager.close();	// fechando o objeto para gerenciamento das entidades
		emfactory.close();      // fechando a conexão com o Banco de Dados		
	
		return aluno;
	}
	
	public List<Aluno> getAlunos() {
		// Criando uma conexão com a nossa base de dados
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");

		// Criando objeto para fazer o gerenciamento das Classes/Entidades
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("get Alunos");
		List<Aluno> alunos = (List<Aluno>) query.getResultList();

		entitymanager.close();	// fechando o objeto para gerenciamento das entidades
		emfactory.close();      // fechando a conexão com o Banco de Dados		

		return alunos;
	}
	
}
