package PaintWizzard;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Wizzard 
{

ArrayList <Paint> PaintList = new ArrayList <Paint> ();
//ArrayList <PricePerLeater> PriceList = new ArrayList <PricePerLeater> ();

DecimalFormat df = new DecimalFormat ("###00.00");

	public Paint p;
//    public PricePerLeater a; 

	public void addPaint(Paint p)
		{
			PaintList.add(p);	
		
	
		}

//public void addPrice (PricePerLeater a)
//{
//	PriceList.add (a);
//}

	public void showPaint()
	{
		for (Paint p : PaintList)
		{
			System.out.println(p);
		}

	}
	
	
//	public void showPrice()
//	{
//		for (PricePerLeater a : PriceList)
//		{
//			System.out.println(a);
//		}
//
//	}
	
		// work out price per leater
	public void compairValue () 
	
	{	
		
		double sum1 = (19.99/20);
		double sum2 = (25/10);
		double sum3 = (17.99/15);
		
		System.out.println("");
		System.out.println("Cheapo Max works out as £" + df.format(sum1) + " per leater");
		System.out.println("AverageJoes is £" + df.format(sum2) + " per leater" );
		System.out.println("DuluxourousPaint is £" + df.format(sum3) + " per leater");
		System.out.println("Cheapo Max works out as the cheapest in regards to value for money");
	}
//HashMap <Integer, Integer> price = new HashMap <> ();
		
//		price.put(1, (int) 19.99);
//		price.put(2,(int) 17.99);
//		price.put(3, 25);	
//		
//		
//		System.out.println(price.get(1));
		//		for (PricePerLeater a : PriceList )
//
//		{
//			
//		}
		//int pricePerLeater = PaintWizzard.AverageJoes.pricePerLeater();
	//	return pricePerLeater;
		
//		int pricePerLeater = PaintWizzard.CheapoMax.pricePerLeater();
//		return pricePerLeater;
		//System.out.println pricePerLeater;
		
//	for (int i = 0; i < PriceList.size(); i++); 
//		{
//			System.out.println(PriceList.get(i));
//		}
//	}
		
		
		// prices [1] = pricePerLeater; 
		
		//	 calling a method from another class cause thats where my calculations are 
		//package.class.method 
//		PaintWizzard.CheapoMax.pricePerLeater();
//		PaintWizzard.DuluxoursPaints.pricePerLeater();
//		System.out.println (AverageJoes.letersPerTin);

	public void compairCoverage ()
	{
		double sum4 = (20*10);
		double sum5 = (15*11);
		double sum6 = (10*20);
		
		System.out.println("");
		System.out.println("Cheapo Max 20 leters can cover" + sum4 + " meters squared ");
		System.out.println("AvergeJoes 15 leaters can cover " + sum5 + " meters squared ");
		System.out.println("DuluxourousPaints 10 leaters will cover " + sum6 + " meters squared ");
		System.out.println("DuluxourousPaints works out as the best in regards to leater compaired to coverage ");
		System.out.println(" ");
	}
	
	
	
	public void waste ()
	{
		double sum7 = (15.00/100);
		//double sum8 = (sum7*5);
		double sum9 = (15-sum7);
		
		System.out.println("");
//		System.out.println(df.format(sum7));
//		System.out.println(sum8);
//		System.out.println(sum9);
//		find 5% take of 15 
		System.out.println("20 leaters of CheapoMax (CM) will cover a full 10 meters squared in comparison");
		System.out.println("5 leaters of AverageJoes (AJ) will cover 10 meters squared 1 tin has 10 leaters so 5 leaters are wasted");
		System.out.println("14.85 leaters of DuluxourousPaints (DP) will cover 10 meters squared and will waste " + sum7 + " leaters");
		System.out.println("CM doesnt waste any paint per Tin");
		System.out.println("AJ wastes 5 leaters which is half a Tin");
		System.out.println("DP wastes 0.15 leaters");
		System.out.println("");
		
	}
	
	public void howManyTins ()
	{
	Scanner	s = new Scanner(System.in);
	System.out.println("enter number of meaters squared you want to cover, below 400 meters squared");
	String number = s.nextLine();
	int result = Integer.parseUnsignedInt(number);
	System.out.println(" Number of CheapoMax Tins for area entered " + ((result*10)/20) 
	+ "   Number of AverageJoes Tins needed are " + ((result*11)/10) + 
	" Number of DuluxourousPaints tins needed "	+ ((result*20)/15)	
			
			);
//	System.out.println("Number of Average Joes Cans needed"+ ((result*20)/15));
	}
	
	
}
	

	
	
// work out price per leter
//	public void compairValue ()
//	{
//		//call pricePerMeter for all 3 
//	}
//
//	public void wastesLeast ()
//	{
//	 
//	// summon howManyMeters 
//		//math of add how many meters. look at leters permeters
//		
//	}
//	
//	public void cheapest ()
//	{
//	//compair Price 	
//	}
//


	
