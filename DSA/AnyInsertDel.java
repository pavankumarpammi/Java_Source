class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next = null;
        }
    }
    public void insertAtEnd(int newData)
    {
        Node newNode =new Node(newData);
        if  (head == null){
            head= newNode ;
            return;
        }
        Node last = head;
        while (last.next !=null )
            last = last.next;
        last.next = newNode ;
    }
    public void insertAtBegin(int newData)
    {
        Node newNode = new Node(newData);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head.next;
        head.next=newNode;

    }
    public void insertAtAny(Node prevNode,int newData)
    {
        if(prevNode==null){
            System.out.println("The given node is NULL");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }
    public void deleteNode(int pos)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(pos==0)
        {
            head=head.next;
            return ;
        }
        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null;i++)
        {
            temp=temp.next;
        }
        if(temp!=null && temp.next!=null)
        {
            temp.next=temp.next.next;
        }
    }
    public void  printList(){
        if(head == null)
        {
            System.out.println("List is empty");
        }
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        LinkedList llist=new LinkedList();
        llist.insertAtEnd(5);
        llist.insertAtBegin(7);
        llist.insertAtEnd(9);
        llist.insertAtAny(llist.head.next, 0);
        llist.insertAtEnd(25);
        llist.printList();
        
    }
}