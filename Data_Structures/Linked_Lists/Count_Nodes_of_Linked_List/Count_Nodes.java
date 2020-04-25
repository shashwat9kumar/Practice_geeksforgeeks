// { Driver Code Starts
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next = null;
    }
    
}

class LinkedList{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            for(int i=0;i<n;i++)
            {int a=sc.nextInt();
            if(head==null){
                head=new Node(a);
            }
            else
                insert(head,a);
            }
            
//            CountNodes g = new CountNodes();
            System.out.println(getCount(head));
        }
    }
    public static Node insert(Node head,int a){
        if(head==null){
            return new Node(a);
        }
        head.next=insert(head.next,a);
        return head;
    }
    
    
    
 // } Driver Code Ends
/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/


    public static int getCount(Node head)
    {
        int count = 0;
        for(Node temp=head; temp != null ; temp=temp.next)
        {
            count++;
        }
        return count;
    }
    

// { Driver Code Starts.
}

  // } Driver Code Ends