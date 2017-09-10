package Library;

public class Journals  extends ReadingMaterial 
{
String author;
String publisher; 
int issueNumber; 
int day;
String month;
int year; 
	
	public Journals(String title, String type, String genre, int id, int pages, String author, String publisher
			, int issueNumber, int day, String month, int year) 
	{
		super(title, type, genre, id, pages);
		
		this.author = author; 
		this.publisher = publisher; 
		this.issueNumber = issueNumber; 
		this.day = day;
		this.month = month;
		this.year = year; 
	}
	public String toString()
	{
	return super.toString() + " author: "  +  author + " publisher: " + publisher + " issue number" 
			+ issueNumber + " date: " + day + ", " + month + ", " + year ;
	}


}
