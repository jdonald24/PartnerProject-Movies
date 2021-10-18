package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Oct 7, 2021
 */

/**
 * @author bdeus
 *
 */
@Entity
@Table(name="movie")
public class Movie {
	//declare attributes
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String genre;
	private LocalDate releaseDate;
	private double rating;
	
	public Movie() {
		
	}//end default constructor

	public Movie(String title, String genre, LocalDate releaseDate, double rating) {
		this.title = title;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.rating = rating;
	}//end all attribute constructor

	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}//end 2 attribute constructor

	public Movie(String title) {
		this.title = title;
	}//end constructor

	public String getTitle() {
		return title;
	}//end getTitle

	public void setTitle(String title) {
		this.title = title;
	}//end setTitle

	public String getGenre() {
		return genre;
	}//end getGenre

	public void setGenre(String genre) {
		this.genre = genre;
	}//end setGenre

	public LocalDate getReleaseDate() {
		return releaseDate;
	}//end getReleaseDate

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}//end setReleaseDate

	public double getRating() {
		return rating;
	}//end getRating

	public void setRating(double rating) {
		this.rating = rating;
	}//end setRating
	
	public int getId() {
		return id;
	}//end getId
	
}//end Movie
