package Library;

public class Maps 
{

	String country;
	String county;
	int id;
	
	
	public Maps (String country, String county, int id)
	{
		this.country = country;
		this.county = county;
		this.id = id;
	}
	
	
	
	public String toString() 
	{
	return  "Country Map relates to: " + country + " County or State in that country " + "id" + id; 
	}
	
	
	public static void main(String[] args) 
	{
		

	}


}
