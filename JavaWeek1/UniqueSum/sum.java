 
public class sum {

	public static void main(String[] args) {

		System.out.println(input1(3, 4, 4));

	}

	public static int input1(int a, int b, int c) 
	{
	 if (a==b && a== c) {
 return 0;
 }
  
 else if(a==b) {
	
		return c;
 }
else if(b==c) {
		return a;
	}
	 
else  if (a==c) {
	return b;
} 
	 
else {
		  return a + b +  c ;
}
}
}