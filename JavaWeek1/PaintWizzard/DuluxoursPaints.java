package PaintWizzard;

public class DuluxoursPaints extends Paint {

int metersUnSquared;
		
	public DuluxoursPaints (String companyName, double price, int letersPerTin, int metersSquaredCoverage, int metersUnSquared)
	{
		super (companyName, price, letersPerTin, metersSquaredCoverage);
		
	}

	
	public String toString() 
	{
		return super.toString() +"Company Name: " + companyName +", Prcie of Tin: " + price + 
				", How many Leaters in this tin: "  + letersPerTin + 
				", How Many Meaters Squared this tin will paint" + metersSquaredCoverage + 
	", Meters Pain will cover when before squaring" + metersUnSquared;
	}	
	//should over ride price 
//	public int getPrice ()
//	{
//		return 25;
//	}
//		public static int pricePerLeater ()
//		{
//			 double sum2 = (25 / 10);
//			 return (int) sum2;
//		}

//		public void howManyMeters ()
//		{
//			int sumB = (meterscoverablePerTin / 10);
//			 System.out.println ("1 leter of DuluxoursPaints can cover " 
//			 + sumB + " meters ");
//			
//		}
}
