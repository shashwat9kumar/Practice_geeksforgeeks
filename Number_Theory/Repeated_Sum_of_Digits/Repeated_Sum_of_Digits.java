import java.util.*;

class Repeated_Sum_of_Digits
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of test cases");
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
			System.out.println("Enter a number to find repeated sum");
			int num = sc.nextInt();
			
			while(num>9)
			{
				int sum =0;
				while(num!=0)
				{
					int d=num%10;
					sum=sum+d;
					num/=10;
				}
				num=sum;
			}
			System.out.println("Repeated sum : " + num);
		}
		
	}
}