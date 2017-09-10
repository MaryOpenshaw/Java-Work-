package Files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Function {

	public static void main(String[] args) 
	
	{
		MakePerson mp = new MakePerson ();
		
		
		Person p = new Person ("Jamie Lanister ", "King Slayer ", 52);
		Person p1 = new Person ("Aria Stark ", "Death ", 16);
	    Person p2 = new Person ("John Franks ", "Teacher ", 66);
	    Person p3 = new Person (" Ann Berlin ", "Ghost Queeen ", 20);
	    Person p4 = new Person ("Time ", "Messimng with People ", 104);
	    
	    mp.addpeople(p);
	    mp.addpeople(p1);
	    mp.addpeople(p2);
	    mp.addpeople(p3);
		mp.addpeople(p4);
		//mp.writeToFile();
		mp.showPeople();
		try {
			mp.BackToList();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mp.printNewList();
	
	}
}
