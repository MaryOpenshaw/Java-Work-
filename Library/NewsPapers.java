package Library;

public class NewsPapers extends ReadingMaterial 
{

	int date;
	String monthOfYear; 
	int year;
	String company;
	
	
	public NewsPapers(String title, String type, String genre, int id, int pages, int date, 
			String monthOfYear, int year, String company) 
	{
		super(title, type, genre, id, pages);
		
		this.date = date;
		this.monthOfYear = monthOfYear;
		this.year =  year; 
		this.company = company; 
		
	}

	public String toString()
	{
	return super.toString() + " date " +  date + ", " + monthOfYear + ", " + year +" Company: "  + company;
	
	}
}