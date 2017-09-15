package buisness;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import utill.JSONUtil;

@ApplicationScoped
@Alternative

public class MovieMap implements MovieServices  {

	@Inject
	private JSONUtil utill;

	public String addMovie(String jsonMovie) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMovies() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
