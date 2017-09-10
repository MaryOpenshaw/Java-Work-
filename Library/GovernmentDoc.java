package Library;

public class GovernmentDoc extends ReadingMaterial 
{

	String areaOfGovernment;
	int yearOfPublication; 

	public GovernmentDoc(String title, String type, String genre, int id, int pages, String areaOfGovernment, int yearOfPublication) 
	{
		super(title, type, genre, id, pages);
		this.areaOfGovernment = areaOfGovernment;
		this.yearOfPublication = yearOfPublication;
		
	}

	
	
	public String toString()
	{
	return super.toString() +  " area of Government: "+ areaOfGovernment +" year of Publication " + yearOfPublication ;
	}
}
