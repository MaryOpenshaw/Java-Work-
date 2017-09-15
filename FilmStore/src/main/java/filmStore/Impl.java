package filmStore;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import filmStore.Film;
import filmStore.JSONUtil;


@ApplicationScoped
@Alternative
public class Impl implements FilmInterface {

	private static final Logger LOGGER = Logger.getLogger(Impl.class);
	private final int INITIAL_COUNT = 1;
	private Map<Integer, Film> filmMap;
	private int ID;

	@Inject
	private JSONUtil util;

	public Impl() {
		this.filmMap = new HashMap<Integer, Film>();
		ID = INITIAL_COUNT;
		initBookStore();
	}

	@Override
	public String getAllFilm() {
		return util.getJSONForObject(filmMap.values());
	}

	@Override
	public String addNewFilm(String filmJson) {
		ID++;
		Film newFilm = util.getObjectForJSON(filmJson, Film.class);
		LOGGER.info("In add book method about to add to map");
		filmMap.put(ID, newFilm);
		LOGGER.info("In add book method book added to map");
		return filmJson;
	}

	@Override
	public String replaceFilm(Integer filmId, String updatedFilm) {
		Film newFilm = util.getObjectForJSON(updatedFilm, Film.class);
		filmMap.put(filmId, newFilm);
		return updatedFilm;
	}

	@Override
	public String deleteFilm(Integer filmId) {
		LOGGER.info("In delete book method about to remove book");
		filmMap.remove(filmId);
		LOGGER.info("In delete film method book removed");
		return "{\"message\": \"film sucessfully removed\"}";
	}

	private void initBookStore() {
		Film aFilm = new Film("Rats", "Horror", "1988");
		filmMap.put(1, aFilm);
	}

}
