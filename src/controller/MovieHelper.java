/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Oct 7, 2021
 */
package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Movie;

public class MovieHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PartnerProject-Movies");
	
	public void addMovie(Movie toInsert) {
		//create entity manager
		EntityManager em = emfactory.createEntityManager();
		
		//add movie and commit changes
		em.getTransaction().begin();
		em.persist(toInsert);
		em.getTransaction().commit();
		
		//close entity manager
		em.close();
	}//end addMovie
	
	public List<Movie> showAllMovies() {
		//create entity manager
		EntityManager em = emfactory.createEntityManager();
		
		//create query for list of movies
		List<Movie> allMovies = em.createQuery("SELECT m FROM Book m").getResultList();
		return allMovies;
	}//end showAllMovies
	
	public Movie searchForMovieById(int tempId) {
		//create entity manager
		EntityManager em = emfactory.createEntityManager();
		
		//find movie
		em.getTransaction().begin();
		Movie found = em.find(Movie.class, tempId);
		
		//close entity manager and return movie
		em.close();
		return found;
	}//end searchForMovieById
	
	public void updateMovie(Movie toEdit) {
		//create entity manager
		EntityManager em = emfactory.createEntityManager();
		
		//update movie and commit changes
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		
		//close entity manager
		em.close();
	}//end updateMovie
	
	public void removeMovie (Movie toDelete) {
		//create entity manager
		EntityManager em = emfactory.createEntityManager();
		
		//remove movie
		em.remove(toDelete);
		
		//commit changes and close entity manager
		em.getTransaction().commit();
		em.close();
	}//end removeMovie
	
}//end MovieHelper
