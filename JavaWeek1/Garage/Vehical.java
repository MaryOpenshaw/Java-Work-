package Garage;

public abstract class Vehical {

	/*e.g. c1 for car one 
	car, van, motor bike
	 who makes its, jaguar bmw
	 gti
	petrol, dezal, electric */

	String id; 
	String typeOfVehical; 
	String colour; 
	String make;  
	String model; 
	String fuleType; 

	public Vehical (String id, String type, String col, String make, String model, String fule) 

	{ 

	this.id = id; 

	typeOfVehical = type; 

	colour = col; 

	this.make = make; 

	this.model= model ; 

	fuleType = fule; 

	} 

	public String toString()  

	{ 

	return "ID: "+ id+ " Type of Vehical: " + typeOfVehical + " Colour: " + colour + 
			" Make of Vehical: " + make+ "Model of Vehical: "+ model +"Type of Fuel Vehical requires : " + fuleType;  

	} 

//	public int getPrice ()  
//
//	{  
//
//	return 150;   
//
//	} 
//
//	public static float serviceCharge() 
//
//	{ 
//
//	return 1.5f; 
//
//	} 
//
//	public void  addVehical () 
//
//	{ 
//
//	} 
//
//	  
//
//	public static void main(String[] args) 
//
//	// print out results of methods 
//
//	{ 

	//} 

	//put array in garage  

	} 

