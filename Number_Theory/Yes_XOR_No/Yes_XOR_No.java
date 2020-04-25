import java.util.*;

public class Yes_XOR_No
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the number of test cases : ");
		int tc = sc.nextInt();

		for(int i=0;i<tc;i++)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];


			System.out.println("Input the elements of Array 1 : ");
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}

			System.out.println("Input the elements of Array 2 : ");
			for(int j=0;j<n;j++)
			{
				b[j]=sc.nextInt();
			}

			Arrays.sort(a);

			Arrays.sort(b);
			
			int count=0;

			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					int element = ((a[j])^(b[k]));
					if(present(a,element) || present(b,element))
					{
						count++;
					}
				}
			}

			if(count%2 == 0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}


		}

		sc.close();
	}


	public static boolean present(int arr[], int key)
	{

		int first=0;
		int last=arr.length-1;

		int mid = (first + last)/2;  


   		while( first <= last )
		{  
      			if ( arr[mid] < key )
			{  
        			first = mid + 1;     
      			}	
			else if ( arr[mid] == key )
			{  
        			return true;  
      			}
			else
			{  
         			last = mid - 1;  
      			}  
      			mid = (first + last)/2;  
   		}  
   		
      		return false;  
   		
	}


}