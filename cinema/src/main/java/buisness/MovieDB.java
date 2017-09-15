package buisness;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import utill.JSONUtil;


import percistance.Movie;

@Default
@Stateless
public class MovieDB  implements MovieServices {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil utill;

	public String addMovie(String jsonMovie) {
		Movie newMovie = utill.getObjectForJSON(jsonMovie, Movie.class);
		em.persist(newMovie);
		return jsonMovie;
		//return String "movie added";
	}

	public String getMovies() {
		Query query = em.createQuery("SELECT m FROM Moive m");
		Collection<Movie> moives = (Collection<Movie>) query.getResultList();
		return utill.getJSONForObject(moives);
	}
	
	
	
	
}
