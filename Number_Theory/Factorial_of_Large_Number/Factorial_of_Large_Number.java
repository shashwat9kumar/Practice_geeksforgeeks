import java.math.*;
import java.util.*;

public class Factorial_of_Large_Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of test cases : ");

		int tc = sc.nextInt();

		for(int i=0;i<tc;i++)
		{
			System.out.println("Enter the number to find the factorial of :" );
			int num = sc.nextInt();
			
			String fact = find(num);

			System.out.println("The factorial is : " + fact);
		}

		sc.close();
	}


	public static String find(int num)
	{
		BigInteger f = new BigInteger("1");

		for(int i=2;i<=num;i++)
		{
			f = f.multiply(BigInteger.valueOf(i));
		}


		String x = f.toString();
		return x;
	}

}