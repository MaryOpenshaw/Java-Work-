package Garage;

public class Car extends Vehical  
{
	int numberOfSeats;
	int numberOfDoors;
	boolean sunRoof; 
	int numberOfWheels;

	public Car(String id, String type, String col, String make, String model, 
			String fule, int seats, int doors, boolean sunRoof, int wheels) 
		{
			super(id, type, col, make, model, fule);
		
			numberOfSeats = seats;
			numberOfDoors=doors;
			this.sunRoof = sunRoof;
			numberOfWheels = wheels; 
		
		}

	public String toString() 
		{
			return super.toString() + " Number of Seats the Car has: " + numberOfSeats + 
				" Number Of Doors the car has " + numberOfDoors + " Car Has a Sun Roof: " + sunRoof 
				+ " Number of Wheels: " + numberOfWheels; 
		}	
	
//	public int getPrice () 
//	{ 
//		return 170;  
//	}
	
//	public String serviceCharge()
//	{
//		return "There will be a service carge of "+ 0.15 ;
//		
//	}
	
	
//	public static void main(String[] args)
//	// print out results of methods
//	{
//		
//	}
}


