import java.util.*;
import java.lang.*;
import java.io.*;

class Corner_Digits {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    String num = sc.next();
		    try{
		        char f = num.charAt(0);
		        int len = num.length();
		        char l = num.charAt((len -1));
		    System.out.println(f + " " + l);
		    }
		    catch(Exception e)
		    {
		        System.out.println(num);
		    }
		}
	}
}