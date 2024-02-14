package zuci.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zuci.mts.dao.MovieDao;
import zuci.mts.model.Movie;
@RestController
public class MovieController {
	
	private MovieDao movieDao; //DI -> 

	@Autowired
	public void setMovieDaoImpl(MovieDao movieDao) {
		this.movieDao = movieDao;
		//MovieDao movieDao=new MovieDaoImpl();
	}
	@PostMapping(value = "/movies",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie addMovie(@RequestBody Movie movie) {
		System.out.println("add movie");
		return movie;
	}

	@GetMapping(value="/movies",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> findAllMoview() {
		return movieDao.findAllMoview();
	}

	@GetMapping(value = "/movies",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie findByMovieName(@RequestParam("moviename") String mn) {
		System.out.println("Welcome");
		System.out.println(movieDao.findByMovieName(mn));
		return movieDao.findByMovieName(mn);
	}
	
	@PutMapping(value = "/movies",
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Movie updateMovie(int movieId) {
		
		return null;
	}

	@DeleteMapping(value = "/movies",
			produces = MediaType.APPLICATION_JSON_VALUE)

	public boolean deleteMovie(int movieId) {
	
		return false;
	}

}
//@RequestMapping(value = "/",produces = MediaType.APPLICATION_XML_VALUE)
//@ResponseBody
//public Movie open1() {
//	return new Movie(3456, "nfbj", 456, new Date());
//}
//@RequestMapping(value = "/",produces = MediaType.APPLICATION_XML_VALUE)
//@ResponseBody
//public Movie open2() {
//	return new Movie(3456, "nfbj", 456, new Date());
//}
//@RequestMapping(value = "/open")
//@ResponseBody
//public String open() {
//	return "Welcome to REST API";
//}