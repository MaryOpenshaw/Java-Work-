package Library;

public class Resources 
{

String typeOfItem;
int id; 
int fineIfNotReturned;


	public Resources(String typeOfItem, int id, int fineIfNotReturned)
	{
			this.typeOfItem = typeOfItem;
			this.id = id ;
			this.fineIfNotReturned = fineIfNotReturned;
	}
	
	
	

	public String toString()  

	{ 

	return "Id: " + id +" type of item " +  typeOfItem + " fine if not returned £" + fineIfNotReturned ;
	}

}
