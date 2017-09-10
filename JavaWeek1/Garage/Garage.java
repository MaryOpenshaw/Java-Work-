package Garage;
import java.util.ArrayList; 

	 
	 

	public class Garage 
	{ 

	//making array list 
	ArrayList <Vehical> VehicalList = new ArrayList <Vehical> ();
	// setting vehical to a variable of V 
	public Vehical v;  
	
		
	
	public void showGarage() 
		{
		for (Vehical v : VehicalList) 
			{
			System.out.println(v);
			}
		}
	
	
	public void addVehical(Vehical v) 
		{
		
		VehicalList.add(v); 
		}
	

	public void removeVehicleById(String id) 
		{
		for (int i = 0; i < VehicalList.size(); i++) 
			{
			if (VehicalList.get(i).id == id) 
				{
				VehicalList.remove(i);
				}
			}
		}
	
	public void removeVehicleByType(String type) 
		{
			for (Vehical v : VehicalList) 
			{
				if (type.equals("car") && v instanceof Car) 
					{
					VehicalList.remove(v);
					
					}
				
				else if (type.equals("van") && v instanceof Van)  
					{
					VehicalList.remove(v);
					} 
				else if (type.equals("motorbike") && v instanceof MotorBike) 
					{
					VehicalList.remove(v);
					}
			}
		}
		
	
		
	public void fixVehical ()
			{
			for (int i = 0; i < VehicalList.size(); i ++) 
				{
				
				if (VehicalList.get(i) instanceof Car)
					{
					System.out.println("£150");
					}
				else if (VehicalList.get(i) instanceof MotorBike);
					{
					System.out.println("£100");
					}
				 if (VehicalList.get(i) instanceof Van);
					{
					System.out.println("£350");
					}
				}		
			}
	
	public void clearGarage ()
		{
		VehicalList.clear();
		}
	
	
	
	}

//	Car v1 = new Car ("C1 ","car ","Blue ", "BMW ", "roadster ", "petrol",5 ,5 ,false ,4); 
//
//	Van v2 = new Van ("Va1 ","van ", "white ", "mercades ", "transit ", "Petrol",  
//
//	52, 41, 31, false); 
//
//	MotorBike v3 = new MotorBike ("B1 ","Bike ", "red ", "Harley Davidson ", "Fat Boy ",  
//
//	"Pertrol", true, false, false); 

//	VehicalList.add(v1);  
//
//	VehicalList.add(v2); 
//
//	VehicalList.add(v3); 

	 
	 

	 
	 
//
//	for (int i = 0; i < VehicalList.size(); i++) { 
//
//	System.out.println(VehicalList.get(i)); 
//
//	} 
//
//	for (int i = 0; i < VehicalList.size(); i++) { 
//
//	VehicalList.get(i); 
//
//	System.out.println(VehicalList.get(i).typeOfVehical + " " +  
//
//	(VehicalList.get(i).getPrice() * Vehical.serviceCharge()) ); 
//
//	} 
//
//	Vehical x;   
//
//	// Getting prices (billing) 
//
//	// going through the loop of the lists  
//
//	for (int i = 0; i < VehicalList.size(); i++) { 
//
//	// if i did not want to asign it to a variable would have to type out Vehical.get(i).  
//
//	//what ever wanted to call  
//
//	//assgining x to the vehical list so search through that list with everything stored in i  
//
//	//which loops  
//
//	x = VehicalList.get(i); 
//
//	// printing stirng then pluse the assignment which type of vehical then string the get price  
//
//	System.out.println("This is a " + 
//
//	x.typeOfVehical +  
//
//	// calling the get price method from vehical then thats is being over writen  
//
//	//by what ever is in  
//
//	" and this cost " + x.getPrice()); 
//
//	} 

	 
	 

	//{ 

	// for (int i = 0; i < VehicalList.size(); i++) { 

	// System.out.println(VehicalList.get(i).id + VehicalList.remove(v1)); 

	//} 

	//} 

			
		
	

	

	 	
	

