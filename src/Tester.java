import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.TheaterHelper;
import model.Movie;
import model.Theater;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Oct 15, 2021
 */
public class Tester {
	public static void main (String [] args) {
		Theater jordanCreek = new Theater ("Jordan Creek", "Jordan Creek Mall");
		LocalDate releaseDate1 = LocalDate.of(2021, 10, 1);
		LocalDate releaseDate2 = LocalDate.of(2016, 4, 20);
		Movie venom = new Movie ("Venom", "Super Hero", releaseDate1, 6.7);
		Movie cats = new Movie ("Cats", "Musical", releaseDate2, 2.0);
		TheaterHelper TH = new TheaterHelper ();
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(venom);
		movieList.add(cats);
		jordanCreek.setListOfMovies(movieList);
		TH.insertTheater(jordanCreek);
		List<Theater> allLists = TH.allTheaters();
		for(Theater a: allLists) {
			System.out.println(a.toString());
		}
	}
}
