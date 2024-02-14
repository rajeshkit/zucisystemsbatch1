package zuci.mts.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import jakarta.validation.Valid;
import zuci.mts.dao.MovieDao;
import zuci.mts.dao.MovieDaoImpl;
import zuci.mts.model.Movie;
@Controller
public class MovieController {
	
	private MovieDao movieDao; //DI -> 
	
	@RequestMapping(value = "/open",produces=MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public Movie open() {
		
		return new Movie(23434,"ush", 5675, new Date());
	}
	
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
	public String addMovie(@Valid @ModelAttribute("movie1") Movie m,BindingResult result,Model model) {
		if(result.hasErrors()) {
			result.getFieldErrors().forEach(e->System.out.println(e.getField()+" "+e.getDefaultMessage()));
			//model.addAttribute(m);
			return "addmovieform";
		}else {
		boolean status = movieDao.addMovie(m);
		if(status==true) {
			model.addAttribute("confirmation", "Movie added successfully");
		}else {
			model.addAttribute("confirmation", "Movie not add ! failed");
		}
		}
		return "registrationresult";
	}

	@RequestMapping("/movies")
	public ModelAndView findAllMoview() {
		ModelAndView mav=new ModelAndView("allmovies");
	    mav.addObject("list",movieDao.findAllMoview());
		return mav;
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
