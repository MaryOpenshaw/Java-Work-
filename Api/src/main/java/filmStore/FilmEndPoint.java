package filmStore;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/filmStore")
public class FilmEndPoint {
	@Inject
	private FilmInterface filmService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getFilmsAsJson() {
		return filmService.getAllFilms();
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewFilmToMap(String filmJson) {
		return filmService.addNewFilm(filmJson);
	}

	@PUT
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String replaceBookFromBookStore(@PathParam("id") Integer id, String filmJson) {
		return filmService.replaceFilm(id,filmJson);
	}

	@DELETE
	@Path("/json/{id}")
	@Produces({ "application/json" })
	public String deleteFilmFromFilmStore(@PathParam("id") Integer id) {
		return filmService.deleteFilm(id);
	}

}