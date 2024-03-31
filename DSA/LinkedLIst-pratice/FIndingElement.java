
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
    public boolean findingElement(int key)
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("LinkedList is empty");
        }
        while(temp!=null)
        {
            if(temp.data ==key)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter the of LinkedList:");
        Scanner ob =new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];//{14->21->11->30->10}
        System.out.println("Enter the elements:");
        Sol fe =new Sol();
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
            fe.insertAtEnd(arr[i]);
        }
        System.out.println("Enter the key to search:");
        int k=ob.nextInt();
        System.out.println(fe.findingElement(k));
        // System.out.println();
        // fe.printList();

    }
}
