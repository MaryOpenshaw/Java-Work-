package PaintWizzard;

import java.text.DecimalFormat;

public class CheapoMax extends Paint {
	int metersNotSquared;
	
	DecimalFormat df = new DecimalFormat ("####0.00");
	public CheapoMax (String companyName, double price, int letersPerTin, int metersSquaredCoverage, int metersNotSquared) 
	{
		super (companyName, price,  letersPerTin,  metersSquaredCoverage);

		this.metersNotSquared = metersNotSquared;
	}
		
		
		public String toString() 
		{
			return super.toString() +"Company Name: " + companyName +", Prcie of Tin: " + df.format (price) + 
					", How many Leaters in this tin: "  + letersPerTin + 
					", How Many Meaters Squared this tin will paint" + metersSquaredCoverage + 
		", Meters Pain will cover when before squaring" + metersNotSquared;
		}	
		
//		public static int pricePerLeater ()
//		{
//			 double sum3 = (19.99/20);
//			 System.out.println(sum3);
//			 return (int) sum3;
//			
//		}	
		
}
		
		//		this.price = price;
//		this.letersPerTin = leterPerTin; 
//		this.meterscoverablePerTin = metersCoverablePerTin;
//		

		
//
//		public void howManyMeters ()
//		{
//			int sumG = (meterscoverablePerTin / 10);
//			int sumH = (sumG * 2);
//			 System.out.println ("1 leter of CheapoMax can cover " 
//			 + sumH + " meters ");
//			
//		}

