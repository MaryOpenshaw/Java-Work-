package Garage;

public class Van extends Vehical{
			
		// for work/ laoding vans only 
		
		int weightOfMaxLoad;
		int length;
		int height; 
		boolean loadingPlatform;
		
		
		
		public Van(String id, String type, String col, String make, String model, String fule, 
				int maxLoad, int length, int height, boolean platform) {
			super(id, type, col, make, model, fule);
			
			weightOfMaxLoad = maxLoad;
			this.length = length;
			this.height =height;
			loadingPlatform = platform;
		}
		
		public String toString() 
		{
			return super.toString() + " The Maximun Weight the Vehical can hold in kg: " + weightOfMaxLoad
					
					+ " Length of Vehical in ft: " + length + "Height of the Vehical in ft: " + height
					
					+ "It has a Loading Platform: " + loadingPlatform; 
		}
		
//		public int getPrice () 
//		{ 
//			return 250;  
//		}
//		
//		
		
//		public String serviceCharge()
//		{
//			return "There will be a service carge of "+ 0.2;
//			
//		}

//		public static void main(String[] args)
//		// print out results of methods
//		{
//			
//		}
	}


