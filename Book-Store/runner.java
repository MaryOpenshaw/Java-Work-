package bookStore;

public class runner {

	

	static function f = new function(); 
	
	


//f.addBook(1,"the Colour of Magic");
	public static void main (String[] args) {
		
		book b0 = new book("The Colour of Magic", "Terry Pratchett");
		book b1 = new book ("The Shepherds Crowns", "Terry Pratchett");
		book b2 = new book ("Northern Lights" , "Phillip Pullman");
		book b3 = new book ("The Subtle Knife","Phillip Pullman");
		f.addBook(1, b1);
		f.addBook(2, b0); 
		f.removeBook(2);
	}
	
}
