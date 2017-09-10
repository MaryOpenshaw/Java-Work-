package PaintWizzard;

import java.text.DecimalFormat;

public abstract class Paint {

	DecimalFormat df = new DecimalFormat ("####0.00");
	String companyName;
	double price;
	int letersPerTin;
	int metersSquaredCoverage; 
	
	
	public Paint (String companyName, double price, int letersPerTin, int metersSquaredCoverage)
	{
		this.companyName = companyName;
		this.price = price;
		this.letersPerTin = letersPerTin;
		this.metersSquaredCoverage = metersSquaredCoverage;
		
		
	}
	
	public String toString() 
	{
		return "Company Name: " + companyName+ ", Price of Tin: " + df.format (price) + 
				", Leaters contained in one tin: "+ letersPerTin +
				", How many squar meters can be covered by this tin of pains: "+ metersSquaredCoverage;
	}
}
