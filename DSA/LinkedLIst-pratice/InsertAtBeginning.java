public class InsertAtBeginning {
    Node head;
     class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void insertAtBegin(int newData)
    {
        Node newNode=new Node(newData);
        if(head==null)
        {
            head=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    public void insertAtAny(Node prevNode,int newData)
    {
        if(prevNode==null)
        {
            System.out.println("The given node is null");
            return ;
        }
        Node newNode =new Node(newData);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        
    }
    public void deleteNode(int pos)
    {
        if(head == null)
        {
            System.out.println("List is empty ");
            return;
        }
        Node temp=head;
        if(pos==0)
        {
            head=temp.next;
            return;
        }  
        for(int i=0;i<pos-1 && temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
        {
            System.out.println("The given position is more than the number of nodes");
            return ;
        }
        temp.next=temp.next.next;
    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        InsertAtBeginning iab = new InsertAtBeginning();
        iab.insertAtBegin(7);
        iab.insertAtBegin(3);
        iab.insertAtBegin(9);
        iab.insertAtBegin(20);
        iab.insertAtBegin(30);
        System.out.println("Given Linked list is: ");
        iab.printList();
        System.out.println();
       // System.out.println("\nInserted at beginning of linked list: ");
        iab.insertAtAny(iab.head.next.next.next, 111);
        iab.printList();
        System.out.println();
        iab.deleteNode(2);
        iab.printList();
        System.out.println();
    }
}
