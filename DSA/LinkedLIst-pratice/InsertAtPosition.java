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
    
    public void insertAtIndex(int pos, int data)
    {
        Node newNode = new Node(data);
        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
        }
        Node curr=head;
        int cnt=0;
        while(curr.next!=null)
        {
            if(cnt==pos-1)
            {
              newNode.next=curr.next;
              curr.next=newNode;
              break;
            }
            curr=curr.next;
            cnt++;
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
        System.out.println("Enter the index to be inserted:");
        int index=ob.nextInt();
        System.out.println("Enter the index to be inserted:");
        int ele=ob.nextInt();
        fe.insertAtIndex(index,ele);
        System.out.println("The Linkedlist after insertion at Index: ");
        fe.printList();
       
    }
}
