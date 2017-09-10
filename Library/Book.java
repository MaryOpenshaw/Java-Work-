package Library;

public class Book extends ReadingMaterial 
{
	
	String author; 
	String eddition;
	
	public Book(String title, String type, String genre, int id, int pages, String author, String eddition) 
		{
			super(title, type, genre, id, pages);
	
			this.author = author;
			this.eddition = eddition; 
		
		
		}

	public String toString()
		{
		return super.toString() + " Author " + author + "eddition" + eddition;
		}
	

}
