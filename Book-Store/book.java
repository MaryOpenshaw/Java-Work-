package bookStore;

public class book {

	String title;
	String author;
	//int total;
	//int id;
	
	public book (String title, String author) {
		private this.title = title;
		private this.author = author;
		//this.total= total;
		//this.id = id;
	}
	
	
	public String toString() {
		return  "Title: " + title + "Author:" + author;
	}


	public String getTitle() {
		return title; 
	
	}
}
