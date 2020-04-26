#include <iostream>
using namespace std;

int main() {
	
	
	int t;
	cout<<"Enter the number of test cases : "<<endl;
	cin>>t;
	
	while(t-- > 0)
	{
	    int n,x;
		cout<<"Enter the number of array elements and the number of items to rotate the array by : "<<endl;
	    cin>>n>>x;
	    
	    int arr[n];
	    
		
		cout<<"Enter the elements of array : "<<endl;
		
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    
	    for(int i=x;i<n;i++)
	    {
	        cout<<arr[i]<<" ";
	    }
	    
	    for(int i=0;i<x;i++)
	    {
	        cout<<arr[i]<<" ";
	    }
	    cout<<endl;
	}
	
	return 0;
}