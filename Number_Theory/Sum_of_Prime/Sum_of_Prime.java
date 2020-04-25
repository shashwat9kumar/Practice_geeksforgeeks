import java.util.*;

public class Sum_of_Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of test cases : ");

		int testCase = sc.nextInt();

		for(int i=0; i<testCase; i++)
		{

			System.out.println("Enter the number to be checked : ");
			int n = sc.nextInt();

			boolean flag = false;

			for(int j = 2; j<=(n/2); j++)
			{
				if(isPrime(j))
				{
					if(isPrime(n-j))
					{
						System.out.println(n+ " can be expressed as a sum of " + j + " and " + (n-j));
						flag = true;
						break;
					}
				}
			}

			if(!(flag))
			{
				System.out.println(n+ " can not be expressed as a sum of two primes ");
			}

		}

		sc.close();
	}


	public static boolean isPrime(int x)
	{
		int count = 0;

		for(int i = 1; i<= x; i++)
		{
			if(x%i == 0)
			{
				count++;
			}
		}

		if(count == 2)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}


}