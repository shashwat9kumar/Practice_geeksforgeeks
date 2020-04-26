#include <iostream>
using namespace std;

int main() {
	
	
	int t;
	cin>>t;
	
	while(t-- > 0)
	{
	    int n,x;
	    cin>>n>>x;
	    
	    int arr[n];
	    
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