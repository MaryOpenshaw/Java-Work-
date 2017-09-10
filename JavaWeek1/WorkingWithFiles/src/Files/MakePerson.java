package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;


public class MakePerson 
{
	
	ArrayList <Person> PersonList = new ArrayList <Person> ();
	ArrayList <List> LList = new ArrayList <List> ();
	
	public Person p; 
	
	public void addpeople (Person p)
    {
    PersonList.add(p);
    }
	
	public void showPeople()
	{
		for (Person p : PersonList) 
		{
		System.out.println("");
		System.out.println(p);
		System.out.println("");
		
		}
	}
	
	
	 public void writeToFile ()
	
    {
        
    try 
    {
    	
    	PrintWriter pw = new PrintWriter (new FileOutputStream("evil.txt"));
    	for( Person Person : PersonList);
    	pw.println(PersonList);
    	pw.close();
    	System.out.println(PersonList);
    	}
    catch (Exception e)
    	{
    	e.printStackTrace();
    	}
   
    }	
	
	 
	 public void printNewList ()
		{
			for (int i = 0; i < LList.size(); i ++)
			{
				if (LList.get(i) != null)
				{
					System.out.print(LList);
				}
					
			}
		}
		 	 
		 
		 //		List <String> list = Files.readAllLines (new Files("C:\\Users\\Adminstrator\\workspace\\WorkingWithFiles\\evil.text"), 
//				 Charset.defaultCharset());
//		Scanner s = new Scanner(new File("C:\\Users\\Adminstrator\\workspace\\WorkingWithFiles\\evil.text"));
//		 ArrayList<String> list = new ArrayList <String> ();
//		 while (s.hasNext())
//		 {
//			 list.add(s.next());
//		 }
//	 s.close();
	 
	
	 
	public void  BackToList() throws FileNotFoundException, IOException
	 {

		ArrayList<String> LList = new ArrayList<String>();
		try {
		FileReader f = new FileReader ("evil.text"); 
		BufferedReader br = new BufferedReader(f); 
		
		String sCurrentLine; 
		while ((sCurrentLine = br.readLine()) != null )
			
		{
			System.out.println(sCurrentLine);
		}
		//InputStream in = 
				//new FileInputStream("C:\\Users\\Adminstrator\\workspace\\WorkingWithFiles\\evil.text");
		//BufferedReader reader = new BufferedReader (new InputStreamReader (in));
		
		//String line = null;
		}
		
		catch (Exception e)
{
    	e.printStackTrace();
    	}
		
	 }
	
	


}
