import java.util.*;

class Three_Consecutive_Digits
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of test cases :");
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			System.out.println("Enter a number");
			int num = sc.nextInt();
			
			int flag =-1;
			
			for(int i = 1; i<=(num/3) ; i++)
			{
				int sum = 3*i + 3;
				if(sum == num)
				{
					System.out.println(i + " " + (i+1) + " " + (i+2));
					flag =1;
					break;
				}
			}
			
			if(flag == -1)
			{
				System.out.println(flag);
			}
		}
		
	}
}