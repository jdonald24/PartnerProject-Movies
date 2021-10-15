package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Theater;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 12, 2021
 */
public class TheaterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PartnerProject-Movies2");
	public void insertTheater (Theater t) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}
	public List<Theater> allTheaters (){
		EntityManager em = emfactory.createEntityManager();
		List<Theater> allTheaters = em.createQuery("SELECT t FROM Theater t").getResultList();
		return allTheaters;
	}
	public Theater searchForTheaterById(Integer tempId) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Theater found = em.find(Theater.class, tempId);
		em.close();
		return found;
	}
	public void editTheater (Theater theaterToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(theaterToEdit);
		em.getTransaction().commit();
		em.close();
	}
	public void deleteTheater (Theater theaterToDelete) {
		EntityManager em = emfactory.createEntityManager();
		Integer tempId = theaterToDelete.getId();
		em.getTransaction().begin();
		Theater found = em.find(Theater.class, tempId);
		em.remove(found);
		em.getTransaction().commit();
		em.close();
	}
}
