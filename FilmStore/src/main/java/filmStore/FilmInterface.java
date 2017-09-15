package filmStore;

public interface FilmInterface {

	String getAllFilm();

	String addNewFilm(String filmJson);

	String replaceFilm(Integer filmId, String updatedFilm);

	String deleteFilm(Integer filmId);

	

}