package zuci.mts.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import zuci.mts.model.Movie;

@Component
public class MovieDaoImpl implements MovieDao {
	@Override
	public boolean addMovie(Movie movie) {
		boolean flag = false;
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
		flag = true;
		return flag;
	}

	@Override
	public List<Movie> findAllMoview() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("FROM Movie");
		List<Movie> listOfMovies = query.getResultList();
		session.getTransaction().commit();
		return listOfMovies;
	}

	@Override
	public Movie findByMovieName(String movieName) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("FROM Movie where movieName=:movietitle");
		query.setParameter("movietitle", movieName);
		Movie listOfMovies = (Movie) query.getResultList().get(0);
		session.getTransaction().commit();
		return listOfMovies;	
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
