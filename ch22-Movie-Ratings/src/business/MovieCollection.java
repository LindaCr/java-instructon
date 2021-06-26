package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {

	private List<Movie> movies;

	public MovieCollection() {
		super();
		movies= new ArrayList<>();
	}
	
	public void add(Movie movie) {
		movies.add(movie);
	}
	//filter movies list by condition
	public List<Movie> filterMovies(Predicate<Movie> condition) {
		//p709
		List<Movie> filteredMovies= new ArrayList<>();
		for (Movie movie: movies) {
			if (condition.test(movie)) {
				filteredMovies.add(movie);
			}
		}
		return filteredMovies;
	}
	
	
	public double getLowestRating() {
		double lowestRating= movies.stream()
				.map(Movie::getRating)
				.reduce(5.0, Math::min);
		return lowestRating;
	}
	
	public double getHighestRating() {
		double highestRating= movies.stream()
				.map(Movie::getRating)
				.reduce(0.0, Math::max);
		return highestRating;
	}
	
	
	public double getAverageRating() {
		double sum=movies.stream()
				.mapToDouble(m ->m.getRating())
				.sum();
		return sum/movies.size();
	}
	
	public int getSize() {
		return movies.size();
	}
	
	
}
