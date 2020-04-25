import java.util.*;

public class Occurrences_of_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of test cases : ");

		int testCase = sc.nextInt();

		for(int i=0; i< testCase ; i++)
		{
			System.out.println("Enter the range i.e n");

			int number = sc.nextInt();

			long sum =0L;

			for(long j = 2; j <= number ; j++)
			{
				String x = j + "";
				sum += (long)find(x);
			}

			System.out.println("The number of 2's are : " + sum);
		}

		sc.close();
	}


	public static int find(String x)
	{
		int len = x.length();

		int count = 0;

		for(int i =0; i < len; i++)
		{
			if( x.charAt(i) == '2' )
			{
				count++;
			}
		}
		return count;
	}
}