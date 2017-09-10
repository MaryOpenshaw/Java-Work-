package PaintWizzard;

public class AverageJoes extends Paint
{
	int notSquare;
	

	public AverageJoes(String companyName, double price, int letersPerTin, int metersSquaredCoverage, int notSquare) 
	{
		super(companyName, price, letersPerTin, metersSquaredCoverage);
		this.notSquare = notSquare; 
	}
	
	
	


	public String toString() 
	{
		return super.toString() +"Company Name: " + companyName +", Prcie of Tin: " + price + 
				", How many Leaters in this tin: "  + letersPerTin + 
				", How Many Meaters Squared this tin will paint" + metersSquaredCoverage + 
	", Meters Pain will cover when before squaring" + notSquare;
	}	


//	public static int  pricePerLeater ()
//	{
//		double sum1 = (17.99 / 15);
////		double pricePerLeater = sum1; 
////		int i = (int) (pricePerLeater);
//		return (int) sum1 ;
//	}
//
//	public void howManyMeters ()
//	{
//		float sum1 = (meterscoverablePerTin / 10);
//		 float sum2 = (sum1 * 2);
//		 float sum3 = (sum2 / 3);
//		 float sum4 = (sum3 * 5);
//		 float sum5 = (meterscoverablePerTin - sum4); 
//		 float sum6 = (sum5 / 10); 
//		 System.out.println ("1 leter of AverageJoes can cover " 
//		 + sum6 + " meters ");
//		
//	}
	
}
