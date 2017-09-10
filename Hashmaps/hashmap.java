package hashmaps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class hashmap {
	public static void main (String[] args) 
	{
	
	HashMap<String, ArrayList <String>> map = new HashMap <String, ArrayList<String>>();
	//ArrayList <words> wordList = new ArrayList <words>();
	
	}

	 public static ArrayList<String> readLines() throws Exception {
	     /// if (!file.exists()) {
	      new ArrayList<String>();
	     // }
	      BufferedReader reader = new BufferedReader(new FileReader("animalList.txt"));
	      ArrayList<String> results = new ArrayList<String>();
	      String line = reader.readLine();
	      while (line != null) 
	      {
	          results.add(line);
	          line = reader.readLine();
	      }
	      return results;
	  }



	 
	 public String sortword (ArrayList<String> Input)
	{
		for  ( int i = 0; i < Input.size(); i++) 
		Input.get(i);
		 char [] ar = Input.toCharArray();
		 Arrays.sort(ar);
		 String sorted = String.valueOf(ar);
		 return sorted; 
	}	
}
