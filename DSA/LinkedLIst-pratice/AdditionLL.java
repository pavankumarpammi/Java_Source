import java.util.*;
class LinkedList{
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    static Node list1,list2;
    public void insertAtBegin(Node head,int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        newNode.next=head.next;
        head=newNode;
    }
    public void printList(Node node)
    {
        Node temp=node;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a num1:");
        int n1=ob.nextInt();
        System.out.println("Enter the num2:");
        int n2=ob.nextInt();
        LinkedList l=new LinkedList();
        Node list1=new Node(n1%10);
        Node list2=new Node(n2%10);
        n1=n1/10;n2=n2/10;
        while(n1>0)
        {
            int rem=n1%10;
            l.insertAtBegin(list1, rem);
            n1=n1/10;
        }
        while(n2>0)
        {
            int rem=n2%10;
            l.insertAtBegin(list2, rem);
            n2=n2/10;
        }
        l.printList(list1);
        System.out.println();
        l.printList(list2);
    }
}