package filmStore;

public class Film {

	
	private String title;
	private String genre;
	private String yearPublished;

	public Film( String title, String genre, String yearPublished) {
	
		this.title = title;
		this.genre = genre;
		this.yearPublished = yearPublished;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}