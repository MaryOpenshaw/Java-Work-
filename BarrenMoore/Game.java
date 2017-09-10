package BarronMoore;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	
	
	public void openingCredits()
	{
	System.out.println("welcome to Barron Moore,so named cause theres not much  here");
	System.out.println("");
	System.out.print("your gaol is to find the treasure chest ");
	System.out.println("Good Luck");
	}
	

	
	public void startGame()
	{
		System.out.println("You awaken to find yourself in a barren moor.");
		System.out.println("try look");
		Scanner sc = new Scanner(System.in);
		String look = sc.nextLine (); 
		System.out.println("Grey foggy clouds float oppressively close to you,");
		System.out.println("reflected in the murky grey water which reaches up your shins.");
		System.out.println("Some black plants barely poke out of the shallow water");
		System.out.println("Try north,south,east,or west");
		System.out.println("You notice a small watch-like device in your left hand.");
		System.out.println("It has hands like a watch, but the hands don't seem to tell time.");
		System.out.println("Chose your direction");
		String direction = sc.next(); 
		System.out.println("just a test at moment");
	}
	
	public static void main (String[] args) 
	{
		
		
		
		
		
		


		
	}	
	
}
