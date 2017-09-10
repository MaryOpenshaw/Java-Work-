package Garage;

public class MotorBike extends Vehical
{
	boolean storageBox;
	boolean windSheild;
	boolean sideCar;
	
	
	public MotorBike(String id, String type, String col, String make, String model,
			String fule, boolean box, boolean sheild, boolean sideCar) 
	{
		super(id, type, col, make, model, fule);
		storageBox = box;
		windSheild = sheild;
		this.sideCar = sideCar;
		
	
		
	}

	public String toString() 
	{
		return super.toString() + " Motor Bike has a Storage Box: " + storageBox +  "Motor Bike has a Windsheild: " 
				+ windSheild + " The Motor Bike has a Sidecar:  " + sideCar ;
	}
	
//	public int getPrice () 
//	{ 
//		return 195;  
//	}
	
//	public flaot  serviceCharge()
//	{
//		return 0.1;
//		
//	}
//	
//	public static void main(String[] args)
//	// print out results of methods
//	{
//		
//	}
}


