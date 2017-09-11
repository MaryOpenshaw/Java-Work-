package filmStore;

public interface FilmInterface {

	String getAllFilms();

	String addNewFilm(String filmJson);

	String replaceFilm(Integer filmId, String updatedFilm);

	String deleteFilm(Integer filmId);

}