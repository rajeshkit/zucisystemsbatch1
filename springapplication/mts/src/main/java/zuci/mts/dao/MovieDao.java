package zuci.mts.dao;

import java.util.List;

import zuci.mts.model.Movie;

public interface MovieDao {
	public boolean addMovie(Movie movie);
	public List<Movie> findAllMoview();
	public Movie findByMovieName(String movieName);
	public Movie updateMovie(int movieId);
	public boolean deleteMovie(int movieId);
}
