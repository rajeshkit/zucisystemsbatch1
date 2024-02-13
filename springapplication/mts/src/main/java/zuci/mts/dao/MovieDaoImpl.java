package zuci.mts.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import zuci.mts.model.Movie;
@Component
public class MovieDaoImpl implements MovieDao {
	@Override
	public boolean addMovie(Movie movie) {
	        Configuration configuration=new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        SessionFactory sessionFactory= configuration.buildSessionFactory();
	        Session session=sessionFactory.openSession();
	        session.beginTransaction();
	        session.save(movie);
	        session.getTransaction().commit();
	        return true;
	}

	@Override
	public List<Movie> findAllMoview() {
	
		return null;
	}

	@Override
	public Movie findByMovieName(String movieName) {
	
		return null;
	}

	@Override
	public Movie updateMovie(int movieId) {
		
		return null;
	}

	@Override
	public boolean deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		return false;
	}

}
