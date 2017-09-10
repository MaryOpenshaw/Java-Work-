package Files;


public class Person 
	{

	
	
	//private static final String txt = null;
	String name;
	String occupation; 
	int age;
	

	public Person (String name, String occupation, int age)
	{
		this.name = name; 
		this.occupation = occupation;
		this.age = age; 
	}
	
	
	public String toString ()
	{
	return  "name " + name + ", occupation " + occupation + ", age" + age;
	}

	

//	public static void main(String[] args)
//	{
//		//addPersons(); 
//	}



	
	
}
//	public void arrayToFile ()
//	{
//		
		
//		//fout file out 
//		FileOutputStream fout;;
//		// telling the programe where to look to createthe text file
//		fout = new FileOutputStream "C:\\Users\\Administrator\\workspace.txt" ;
//		
//		Person.add(p); 
//	PrintWriter pw = new PrintWriter (new FileOutputSteam(People));
//		
//		for (int i = 0; i <PersonList.size(); i++)   
//			for (Person Person : Person)
//				pw.println(Person.get(p)) ;
				//Person p : PersonList)
//		{
//			//PersonList.get(index);
//		}































