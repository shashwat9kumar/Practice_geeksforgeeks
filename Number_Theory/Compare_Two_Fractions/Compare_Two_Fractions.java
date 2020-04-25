import java.util.*;

class Compare_Two_Fractions
{
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of test cases : ");
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			System.out.println("Enter the fractions : ");
			String x = sc.next();
			String y = sc.next();
			
			
			
			
			
			
			String str1[] =x.split("/",2);
			String str2[] =y.split("/",2);
			
			
			
			
			
			str1[1]= str1[1].substring(0, (str1[1].length()-1));
			
			
			
			double n1 = Double.parseDouble(str1[0]);
			double n2 = Double.parseDouble(str2[0]);
			
			double d1 = Double.parseDouble(str1[1]);
			double d2 = Double.parseDouble(str2[1]);
			
			
			double f1 = n1/d1;
			double f2 = n2/d2;
			
			if(f1 > f2)
			{
				System.out.println(str1[0]+"/"+str1[1]);
			}
			else if(f2 > f1)
			{
				System.out.println(str2[0]+"/"+str2[1]);
			}
			else
			{
				System.out.println("equal");
			}
			
			
			
		}
		
	}
	
}