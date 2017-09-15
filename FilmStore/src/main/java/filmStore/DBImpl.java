package filmStore;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import filmStore.Film;
import filmStore.JSONUtil;

@Stateless
@Default
public class DBImpl implements FilmInterface {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil util;

	@Override
	public String getAllFilm() {
		Query query = em.createQuery("SELECT e FROM Film e");
		Collection<Film> films = (Collection<Film>) query.getResultList();
		return util.getJSONForObject(films);
	}

	@Override
	public String addNewFilm(String filmJson) {
		Film newFilm = util.getObjectForJSON(filmJson, Film.class);
		em.persist(newFilm);
		return filmJson;
	}

	@Override
	public String replaceFilm(Integer filmId, String updatedFilm) {
		Film updateFilm = util.getObjectForJSON(updatedFilm, Film.class);
		Film film = findFilm(new Long(filmId));
		if (film != null) {
			film = updateFilm;
			em.merge(film);
		}
		return "{\"message\": \"book sucessfully updated\"}";
	}

	

	@Override
	public String deleteFilm(Integer filmId) {
		Film film = findFilm(new Long(filmId));
		if (film != null) {
			em.remove(film);
		}
		return "{\"message\": \"book sucessfully removed\"}";
	}

	private Film findFilm(Long id) {
		return em.find(Film.class, id);
	}

}
