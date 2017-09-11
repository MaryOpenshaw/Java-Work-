package filmStore;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.apache.log4j.Logger;


import filmStore.JSONUtil;


@ApplicationScoped
@Default
public class FilmService implements FilmInterface {
	private static final Logger LOGGER = Logger.getLogger(FilmService.class);
	private final int INITIAL_COUNT = 1;
	private Map<Integer, Film> filmMap;
	private int ID;

	@Inject
	private JSONUtil util;
	
	public FilmService() {
		this.filmMap = new HashMap<Integer, Film>();
		ID = INITIAL_COUNT;
		initFilmStore();
	}

	/* (non-Javadoc)
	 * @see filmStore.FilmInterface#getAllFilms()
	 */
	public String getAllFilms() {
		return util.getJSONForObject(filmMap.values());
	}

	/* (non-Javadoc)
	 * @see filmStore.FilmInterface#addNewFilm(java.lang.String)
	 */
	public String addNewFilm(String filmJson) {
		ID++;
		Film newFilm = util.getObjectForJSON(filmJson, Film.class);
		LOGGER.info("In add film method about to add to map");
		filmMap.put(ID, newFilm);
		LOGGER.info("In add film method book added to map");
		return filmJson;
	}

	/* (non-Javadoc)
	 * @see filmStore.FilmInterface#replaceFilm(java.lang.Integer, java.lang.String)
	 */
	public String replaceFilm(Integer filmId, String updatedFilm) {
		Film newFilm = util.getObjectForJSON(updatedFilm, Film.class);
		filmMap.put(filmId, newFilm);
		return updatedFilm;
	}

	/* (non-Javadoc)
	 * @see filmStore.FilmInterface#deleteFilm(java.lang.Integer)
	 */
	public String deleteFilm(Integer filmId) {
		LOGGER.info("In delete book method about to remove book");
		filmMap.remove(filmId);
		LOGGER.info("In delete book method book removed");
		return "{\"message\": \"book sucessfully removed\"}";
	}

	private void initFilmStore() {
		Film aFilm = new Film( "Thor", "Sci-Fi", "2011");
	//	Film bFilm = new Film("Dungeons and Dragons", " Fantasy","1980");
		filmMap.put(1, aFilm);
	//	filmMap.put(1, bFilm);
	}

}


