import java.util.*;

public class excel_sheet
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		

		int testCase = sc.nextInt();

		for( int it = 0 ; it < testCase ; it++)
		{	
			String column = sc.next();
			int len = column.length();

			column = column.toUpperCase();

			
			int no=0;
			int pow=0;
			for( int i = len - 1 ; i >= 0 ; i-- )
			{
				int num = (column.charAt(i)) - 64;
				no = no + ((int)Math.pow(26,pow) * num);
				pow++;
			}

			System.out.println("The column number for the column " + column + " is : " + no);
		}
		
		sc.close();
	}
}