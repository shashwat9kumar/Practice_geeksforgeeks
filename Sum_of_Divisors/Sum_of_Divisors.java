import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


class Sum_of_Divisors {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-- > 0)
		{
		    int num=sc.nextInt();
		    BigInteger sum = new BigInteger("0");
		    
		    
		    for(int i=1;i<=(num/2);i++)
		    {
		        if(num%i==0)
		        {
		            String x= i+"";
		            BigInteger xx = new BigInteger(x);
		            sum = sum.add(xx);
		        }
		    }
		    System.out.println(sum);
		}
		
	}
}