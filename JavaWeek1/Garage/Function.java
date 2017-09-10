package Garage;

public class Function 
	{
		public static void main (String[] args) 
			{
	

			// creating a new garage object 
			Garage g = new Garage (); 
	
			/* creating a new opject. i.e all new vehicals are created in here.  */
	
			Car v = new Car ("C1 ","car ","Blue ", "BMW ", "roadster ", "petrol",5 ,5 ,false ,4); 

			Van v1 = new Van ("Va1 ","van ", "white ", "mercades ", "transit ", "Petrol",  
					52, 41, 31, false); 

			MotorBike v2 = new MotorBike ("B1 ","Bike ", "red ", "Harley Davidson ", "Fat Boy ",  
					"Pertrol", true, false, false); 

			g.addVehical(v);
			g.addVehical(v1);
			g.addVehical(v2);
			g.showGarage();
//			g.removeVehicleById(null);
//			g.removeVehicleByType(null);
			g.fixVehical();
			g.clearGarage();
			
			}
	}