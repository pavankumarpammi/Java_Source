
import java.util.*;
class Sol {
    class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
Node head;
    
    public  void insertAtEnd(int ele)
    {
        Node newNode =new Node(ele);
        if(head==null)
        {
            head =newNode;
            return ;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }

    }
    public void removedup()
    {
        if(head==null)
        {
            System.out.println("Linkedlist is Empty!");
            return ;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
    
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("Enter the of LinkedList:");
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        Sol fe =new Sol();
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
            fe.insertAtEnd(arr[i]);
        }
        fe.printList();
        System.out.println();
        fe.removedup();
        fe.printList();
       ob.close();
    }
}
