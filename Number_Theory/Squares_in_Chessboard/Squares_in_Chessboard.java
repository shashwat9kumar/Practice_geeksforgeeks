import java.util.*;

public class Squares_in_Chessboard
{
	public static void main(String args[])
	{



		/*

		
			The number of squares in a N x N grid are :

			n^2 + (n-1)^2 + (n-2)^2 + ...... +2^2 + 1^2


			sum of squares of n natural numbers also equals to :
			
			( (n)*(n-1)*(2*n-1) ) / 6

		*/
		


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of test cases");
		
		int testCase = sc.nextInt();
		
		for( int i = 0; i<testCase; i++)
		{

			System.out.println("Enter the order of N x N grid :");

			int n = sc.nextInt();
			
			long sum=0;

			for(int j = 1; j <= n; j++)
			{
				sum += (long)Math.pow(j,2);
			}

			System.out.println("The number of squares in a N x N grid of order " + n + " is : " + sum);

		}

		sc.close();
		
	}
}