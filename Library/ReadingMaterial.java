package Library;

public abstract class ReadingMaterial 
{
	
	String title;
	String typeOfMaterial;
	// genra if book 
	String classification;
	int id;
	int numberOfPages;
	
	
	public ReadingMaterial (String title, String type, String genre, int id, int pages)
	{
		this.title = title;
		typeOfMaterial = type; 
		classification = genre;
		this.id = id;
		numberOfPages = pages;	
		
	}
	
	
	public String toString ()
	{
		return "Title " + title +   "Type of reading material " + typeOfMaterial + " classification of material " + classification 
				+ " id: " + id + " number of pages " + numberOfPages;
	}
	
	public static void main(String[] args) 
	{
	
		

	}

}
