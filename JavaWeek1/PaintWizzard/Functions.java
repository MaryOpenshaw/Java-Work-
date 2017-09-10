package PaintWizzard;

public class Functions 

{

	

	public static void main (String[] args)
		{
		 Wizzard w = new  Wizzard () ;
		
		CheapoMax p = new CheapoMax ("Cheapomax", 19.99, 10,20,100) ;
		AverageJoes p1 = new AverageJoes ("AverageJoes",17.99 ,15, 11,121) ;
		DuluxoursPaints p2 = new DuluxoursPaints ("DuluxoursPaints",25,10,20,400) ;
		//PricePerLeater a = new PricePerLeater (PaintWizzard.AverageJoes.pricePerLeater()) ;
//		PricePerLeater a = new PricePerLeater (19.99);
//		PricePerLeater a1 = new PricePerLeater (17.99);
//		PricePerLeater a2 = new PricePerLeater (25.00);
		//a is Cheapo Max 
		//a1 is average Joes 
		//a2 is dulux
		
		w.addPaint(p); 
		w.addPaint(p1);
		w.addPaint(p2);
//		w.addPrice(a);
//		w.addPrice(a1);
//		w.addPrice(a2);
		w.showPaint();
//		w.showPrice();
		w.compairValue ();
		w.waste();
		w.compairCoverage();
		w.howManyTins();
	
	}
}
