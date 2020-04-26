#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	
	cin>>t;
	
	while(t-- > 0)
	{
	    int n,k;
	    cin>>n>>k;
	    int arr[n];
	    
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    sort(arr, arr+n);
	    for(int i=0;i<n;i++)
	    {
	        cout<<arr[i]<<" ";
	    }
	    cout<<endl;
	}
}

/*
Try doing it by min heap
*/