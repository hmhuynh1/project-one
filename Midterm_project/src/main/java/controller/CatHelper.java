package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;
import javax.persistence.TypedQuery;

import model.CatBreed;


public class CatHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("AboutCats");
	
	public void persist(CatBreed model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(CatBreed model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(CatBreed.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<CatBreed> showAllCatBreed() {
		EntityManager manager = factory.createEntityManager();
		List<CatBreed> allItems = manager.createQuery("SELECT i FROM CatBreed i").getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(CatBreed model) {
		EntityManager manager = factory.createEntityManager();
		CatBreed dbEntity = manager.find(CatBreed.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setBreeds(model.getBreeds());
		dbEntity.setSize(model.getSize());
		manager.getTransaction().commit();
		manager.close();
	}
		
	
	public CatBreed searchCatByBreed(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<CatBreed> query = manager.createQuery("SELECT i FROM CatBreed AS i WHERE i.breeds = :breeds", CatBreed.class);
		query.setParameter("breeds", oldName);
		CatBreed dbEntity = query.getSingleResult();
		return dbEntity;
	}

}
