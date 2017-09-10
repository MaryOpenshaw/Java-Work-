package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class two {
		// runs before a method every time the method is run  
		@Before
		public void two()
		{
			System.out.println("Before");
		}
		
		//is like a normal methods
		@Test
		public void three ()
		{
			System.out.println("Test");
		}
		
		
		// runs after a method is run every time
		@After
		public void four ()
		{
		
			System.out.println("After");
		}
		
		//runs as the last pit of code to be compiles 
		@AfterClass
		public static void five()
		{
			System.out.println("After class");
		}
		
}
