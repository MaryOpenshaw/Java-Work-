 
package BattelShips;
import java.util.Arrays;
public class TheGrid 

{
	
	
	public void printRow(int[]row)
	{
		for (int i: row)
		{
			System.out.print(i);
			
			//puts spaces between each number 
			System.out.print("\t");
		}
	System.out.println(); 
	}
	
	
	public void grid ()

	{
		// crerating 3 by 3 array 
	int [][] grid = new int [3] [3];
	//defined variables first as other wise grid doesnt print properly 
	int i; 
	int j; 
	
	// setting i and j variables to the arrays
	for ( i = 0; i < grid.length; i ++) 
			{
		for ( j = 0; j < grid[i].length; j++)
				{
			grid [i] [j] = 0;
			
				}	
		grid [1] [1] = 1;
		grid[1] [2]=1;
			}
	
	for (int[] row : grid)
		{
		printRow (row);
		}
	
	
	}		
	
//public void setShip1 ()
//{
//	
//	
//	//ship 1 possition 
//}	

	
//	public static void main(String[] args) 
//	{
//
//		
//		
//	}

	
	
	
	
	
}
	
//	grid[1][1] = 1;
//	grid[1][2]=1;
	//ship 1 possition 
	
	

	
	



