package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 12, 2021
 */
@Entity
@Table(name="theater")
public class Theater {
	@Id
	@GeneratedValue
	private int id;
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	private List<Movie> listOfMovies;
	private String theaterName;
	private String theaterLocation;
	public Theater () {
		
	}
	public Theater (String theaterName, String theaterLocation, List<Movie> listOfMovies) {
		this.theaterName = theaterName;
		this.theaterLocation = theaterLocation;
		this.listOfMovies = listOfMovies;
	}
	/**
	 * @param theaterName
	 * @param theaterLocation
	 */
	public Theater(String theaterName, String theaterLocation) {
		super();
		this.theaterName = theaterName;
		this.theaterLocation = theaterLocation;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the listOfMovies
	 */
	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}
	/**
	 * @param listOfMovies the listOfMovies to set
	 */
	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	/**
	 * @return the theaterName
	 */
	public String getTheaterName() {
		return theaterName;
	}
	/**
	 * @param theaterName the theaterName to set
	 */
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	/**
	 * @return the theaterLocation
	 */
	public String getTheaterLocation() {
		return theaterLocation;
	}
	/**
	 * @param theaterLocation the theaterLocation to set
	 */
	public void setTheaterLocation(String theaterLocation) {
		this.theaterLocation = theaterLocation;
	}
	@Override
	public String toString() {
		return "Theater [id=" + id + ", listOfMovies=" + listOfMovies + ", theaterName=" + theaterName
				+ ", theaterLocation=" + theaterLocation + "]";
	}
}
