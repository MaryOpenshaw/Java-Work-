
public class HelloWorld {

	public static void main(String[] args)
	// print out results of methods
	{
	   System.out.println("Hello World!");
		System.out.println(sum(5, 6, true));
		System.out.println(sumTwo(0, 9));

		taskIteration();
		taksArrays();
		taksArrays1();
	}

	// working on a boolean added to a simple variable

	public static int sum(int a, int b, boolean d)
	// note to self == means compare = sets
	{

		if (d == true) {
			int c = a + b;
			return c;
		}

		else {
			int e = a * b;
			return e;

		}

	}

	// 2 intergers variables
	public static int sumTwo(int a, int b) {

		if (a == 0) {
			return b;
		}

		if (b == 0) {
			return a;
		}
		return 72;
	}

	/// for this new method, while print < 10 keep printing, when >10 stop
	// call previous method then output that method

	public static int taskIteration() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
		return 0;

	}

	public static void taksArrays() {
		// creating the interger and setting the feilds to 10

		int[] example1 = new int[10];
		// setting the int to 0, tellling the i variable that if it is greater than [10]. i will ingrament 
		for (int i = 0; i < example1.length; i++) {
			System.out.println(i);
		}
	
	}

	public static void taksArrays1() {
		// creating the interger and setting the feilds to 10

		int[] example2 = new int[10];
		// setting the int to 0, tellling the i variable that if it is greater than [10]. i will ingrament 
		for (int i = 0; i < example2.length; i++) {
          //telling it to times i by 10
			example2[i] = i * 10; 
                          } 
         // telling it to times by 10 again makes it 1000 before printing it out 
         for (int i = 0; i < example2.length; i++) { 
          // example2[i] = example2[i] * 10; 
                 } 
         for (int i : example2) { 
             System.out.println(i); 
		     }
		
	  }
  }
