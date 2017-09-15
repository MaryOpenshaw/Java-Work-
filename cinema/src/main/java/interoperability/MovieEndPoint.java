package interoperability;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import buisness.MovieServices;

@Path("/cinema")
public class MovieEndPoint {

	@Inject
	private MovieServices movieService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getMovieAsJson() {
		return movieService.getMovies();
	}

	@POST
	@Path("/json")
	@Produces({ "application/json" })
	public String addNewFilm(String jsonMovie) {
		return movieService.addMovie(jsonMovie);
	}
}
