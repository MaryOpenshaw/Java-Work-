package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	ClassIWantToTest referencevariable = new instantofClass
			variable = referancevariable.methodin class
			assertEquals= (value, what is the return statment) 
	
	}



@Test 
public void checkGenre() {
	String g1= "horror";
	String g2 ="horror"; 
	
	assertEquals(g1,g2); 
}
**/

@Test
public void chechGenre1() {
	Books b = new Books("");
	b.returnGenre();
	equals (b.returnGenre());
}

}
