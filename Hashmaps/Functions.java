package hashmaps;

import java.io.IOException;

public class Functions {

	public static void main (String[] args) 
	{
		hashmap h = new hashmap();
		
		
//	try {
//		h.bufferedcopy(null);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	/*
		try {
			System.out.println(hashmap.readLines() ) ;
				} 
			catch (Exception e) 
				{
		// TODO Auto-generated catch block
		e.printStackTrace();
			}*/
	
	
	try {
		System.out.println(h.sortword(hashmap.readLines()));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

   
}