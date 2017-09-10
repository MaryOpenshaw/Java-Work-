
public class Season {

	public static void main(String[] args) {
		System.out.println(season(30, false));

	}
	
	public static boolean season(int a, boolean b)
	{
		if (b == true && a > 60 && a < 100) {
			return true;	 
		}
		else if (b== false && a > 60 && a < 90)
		{
		return true;
		}
		else {
			return false; 
		}
		

	}
} 