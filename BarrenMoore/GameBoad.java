package BarronMoore;
import java.util.Arrays;


public class GameBoad 

{
// has map game board 
	
	
//	public void printRow(int[]row) 
//	{
//		//for (int i: row)
//		{
//			System.out.println(i);
//		System.out.println("\t");
//		}
//		System.out.println();
//	}

	public void buildBoard ()
	{
		int [][] board = new int [10][10];
		int i ;
		int j = 0;
		
		for (i = 0; i < board.length; i++ )
		{
			for (j = 0; j < board[i].length; j++)
			{
				board [i] [j] = 0 ;
			//	System.out.print(board [i] [j]);
			}
			// System.out.println();
		}
		

	}
	

	
	public static void main(String[] args)
	{
		
	}
	
}
