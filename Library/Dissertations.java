package Library;

public class Dissertations extends ReadingMaterial 
{
	String author;
	String publisher;
	

	public Dissertations(String title, String type, String genre, int id, int pages, String author, 
			String publisher) 
	{
		super(title, type, genre, id, pages);
	
		this.author = author;
		this.publisher = publisher; 
	}
	public String toString() 
	{
		return super.toString() + " author: " + author +  " publisher " + publisher ;
	}
}
