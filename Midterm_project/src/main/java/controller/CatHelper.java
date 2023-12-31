package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.catBreeds;


public class CatHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("AboutCats");
	
	public void persist(catBreeds model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(catBreeds model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(catBreeds.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<catBreeds> showAllCatBreed() {
		EntityManager manager = factory.createEntityManager();
		List<catBreeds> allItems = manager.createQuery("SELECT i FROM catBreeds i").getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(catBreeds model) {
		EntityManager manager = factory.createEntityManager();
		catBreeds dbEntity = manager.find(catBreeds.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setBreeds(model.getBreeds());
		dbEntity.setFactsAboutCats(model.getFactsAboutCats());
		dbEntity.setCatSize(model.getCatSize());
		manager.getTransaction().commit();
		manager.close();
	}
		
	
	public catBreeds searchCatByBreed(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<catBreeds> query = manager.createQuery("SELECT i FROM catBreeds AS i WHERE i.breeds = :breeds", catBreeds.class);
		query.setParameter("breeds", oldName);
		catBreeds dbEntity = query.getSingleResult();
		return dbEntity;
	}

}
