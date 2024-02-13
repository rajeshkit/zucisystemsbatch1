package zuci.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import zuci.mts.dao.MovieDao;
import zuci.mts.dao.MovieDaoImpl;
import zuci.mts.model.Movie;
@Controller
public class MovieController {
	
	private MovieDao movieDao; //DI -> 
	
	
	@Autowired
	public void setMovieDaoImpl(MovieDao movieDao) {
		this.movieDao = movieDao;
		//MovieDao movieDao=new MovieDaoImpl();
	}
	@RequestMapping("/openmovieform")
	public String openMovieForm(Model model) {
		model.addAttribute("movie1", new Movie());
		return "addmovieform";
	}
	@RequestMapping("/addmovie")
	public String addMovie(@ModelAttribute Movie m) {
//		Movie movie=new Movie();
//		movie.setMovieId(Integer.parseInt(request.getParameter("id")));
//		movie.setTicketCost(Integer.parseInt(request.getParameter("cost")));
		
		movieDao.addMovie(m);
		return "";
	}

	
	public List<Movie> findAllMoview() {
	
		return null;
	}

	
	public Movie findByMovieName(String movieName) {
	
		return null;
	}

	
	public Movie updateMovie(int movieId) {
		
		return null;
	}

	
	public boolean deleteMovie(int movieId) {
	
		return false;
	}

}
