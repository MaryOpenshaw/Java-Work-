import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int inputNumber;

Scanner sc = new Scanner (System.in);
System.out.println("Enter a Number");

inputNumber = sc.nextInt();

int squareNumber = inputNumber * inputNumber;

int array [][] = new int [inputNumber][inputNumber];

//starting row index
int a = 0; 
// ending row index
int b = inputNumber -1; 
// starting collumn index
int c = 0; 
//ending collumn index
int d = inputNumber -1; 

//iterator
int e = 1; 


//forwards remove false peramitor 
if (false)
{ 
	while (e <= squareNumber) 
	{ 
		for (int i = c; i <= d; i++)
		{
		array [a][i] = e; 
		e ++ ;  
		}

		for (int i = a + 1; i <= b; i++)
		{
		array [i][d] = e;
		e ++ ;
		}

		for (int i = d - 1; i >= c; i--) 
		{
		array [b] [i] = e ;
		e ++ ;
		}


		for (int i= b - 1; i >= a+1; i --)
		{
		array [i][c] = e ;
		e ++ ; 
		}
	
		a ++ ;
		b -- ;
		c ++ ;
		d -- ;
	}
	
}

// backwards hopefully 
else 
{
	while (e <= squareNumber) 
	{ 
		for (int i = c; i <= d; i++)
		{
		array [i][c] = e; 
		e ++ ;  
		}

		for (int i = a + 1; i <= b; i++)
		{
		array [b][i] = e;
		e ++ ;
		}

		for (int i = d - 1; i >= c; i--) 
		{
		array [i] [d] = e ;
		e ++ ;
		}


		for (int i= b - 1; i >= a+1; i --)
		{
		array [a][i] = e ;
		e ++ ; 
		}
	
		a ++ ;
		b -- ;
		c ++ ;
		d -- ;
	}
	
}

String line; 

for (int i = 0; i < inputNumber; i++)
{ 
	
	line = ""; 
	for (int j = 0; j <inputNumber; j++) 
	{
		if (array[i][j] < 10) 
		{
			line += (array [i][j] + "  ");
		}
		else 
		{
			line += (array [i][j] + " ");
		}
	}
System.out.println(line);

}
//for (int i = 0; i < squareNumber; i++)
//{
//	array[i] = i; 
//}

	}

	
	
}
