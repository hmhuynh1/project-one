package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.OwnerAddress;



public class AddressHelper {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("AboutCats");
	
	public void persist(OwnerAddress model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(OwnerAddress model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(OwnerAddress.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<OwnerAddress> showAllAddress() {
		EntityManager manager = factory.createEntityManager();
		List<OwnerAddress> allItems = manager.createQuery("SELECT i FROM ownerAddress i").getResultList();
		manager.close();
		return allItems;
		
	}

	public void update(OwnerAddress model) {
		EntityManager manager = factory.createEntityManager();
		OwnerAddress dbEntity = manager.find(OwnerAddress.class, model.getRowId());
		manager.getTransaction().begin();
		dbEntity.setCatName(model.getCatName());
		dbEntity.setOwnerAddress(model.getOwnerAddress());
		dbEntity.setOwnerPhoneNumber(model.getOwnerPhoneNumber());
		manager.getTransaction().commit();
		manager.close();
	}
		
	
	public OwnerAddress searchAddress(String oldName) {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<OwnerAddress> query = manager.createQuery("SELECT i FROM ownerAddress  AS i WHERE i.catName = :catName", OwnerAddress.class);
		query.setParameter("catName", oldName);
		OwnerAddress dbEntity = query.getSingleResult();
		return dbEntity;
	}
}
