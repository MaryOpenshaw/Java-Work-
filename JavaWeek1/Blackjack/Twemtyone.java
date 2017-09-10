
public class Twemtyone {

	public static void main(String[] args) {

		System.out.println(method21(2,4));
	}

	public static int method21(int a, int b)
	// needs 2 intergers bigger than 0
	// put them into arrays first 
	{
		if (a < 0 && a >= 10) {
			return a;
			//int c = (21-a);
	}
	// the other if/ else statements will only activate if the first one doens't return a value, 

	else if (b < 0 && b >= 10) {
			return b;
			//int d = (21-b);
		}	 
	else if
	  
		(a + b >= 21)  {
	  return 0;
	  }
		
	else if (a > b ){
		return a;
	}
	
	 else {
		 return b;
		 
	 }
	}
	
}
