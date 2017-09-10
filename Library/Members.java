package Library;

public class Members 
{
	
	int memberId;
	String foreName;
	String sureName;
	int age; 
	
	public Members (int memberId, String foreName, String surName, int age)
	{
		this.memberId = memberId;
		this.foreName = foreName;
		this.sureName = surName;
		this.age = age;
	}
	
	
	
	

	public String toString()  

	{ 

	return "Id " + memberId + " firstname: " + foreName + " Surname: " + sureName + " age: " + age ;
	}
	
	
	
	public static void main(String[] args) 
	{
		
	}

}
