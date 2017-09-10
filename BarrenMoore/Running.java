package BarronMoore;

public class Running 
{

	public static void main (String[] args) 
	{

		GameBoad gb = new GameBoad ();
		Game g = new Game();
		gb.buildBoard();
		//gb. printRow(null);
		
		
		g.openingCredits();
		g.startGame();
	
	
	}

}
