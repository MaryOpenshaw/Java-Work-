package Library;

public class Magazines  extends ReadingMaterial 
{

	int issue;  
	int day; 
	String month;
	int year;
	
	
	public Magazines(String title, String type, String genre, int id, int pages, int issue, int day, 
			String month, int year) 
	{
	super(title, type, genre, id, pages);
	this.issue = issue;
	this.day = day;
	this.month = month; 
	this.year = year; 
	
	}
	public String toString() 
	{
	return super.toString() + " issue number " + issue + " date: " + day + ", " + month + ", " + year; 	
	}
}
