package examen;

import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exam {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("examen");
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		}
		finally {
		if (connection != null) {
		    connection.close();
		  }
		}
	}

public void ajoutcontrol(Resultat resultat) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("doc");
	EntityManager entityManager = emf.createEntityManager();
	try {
		entityManager.getTransaction().begin();
		entityManager.persist(resultat);
		entityManager.getTransaction().commit();
		}
	finally {
	  entityManager.close();
	  emf.close();
	}
}

public void ajoutProjet(Resultat resultat) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("doc");
	EntityManager entityManager = emf.createEntityManager();
	try {
		entityManager.getTransaction().begin();
		entityManager.persist(resultat);
		entityManager.getTransaction().commit();
		}
	finally {
	  entityManager.close();
	  emf.close();
	}
}
}
