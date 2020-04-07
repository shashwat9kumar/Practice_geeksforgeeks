import java.util.*;

public class Excel_sheet_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of test cases :");
		int tc = sc.nextInt();
		
		for(int i = 0; i<tc;i++)
		{

			System.out.println("Enter the number to find the column name :");

			int n=sc.nextInt();
			
			String str = "";

			while( n != 0 )
			{
				n=n-1;
				str = (char)(n%26 + 'A') + str;

				n=n/26;
			}
			System.out.println(str);

		}

		sc.close();
	}
}