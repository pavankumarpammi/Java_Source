// // public class InsertNodeAtEnd {
// //     static Node head;
// //     public static class Node {
        
// //         int  data;
// //         Node next;
// //         Node(int d)
// //         {
// //             data=d;
// //             next=null;
// //         }
// //     }
// //     public static void  insertNodeAtEnd(int newData){
// //         Node newNode =new Node(newData);
// //         if (head == null)
// //             head = newNode;
// //         else {
// //             Node temp = head;
// //             while (temp.next != null)
// //                 temp = temp.next;
// //             temp.next = newNode;
// //         }
// //     }
// //     public static void printLList()
// //     {
// //         Node current=head;
// //         while(current.next!=null)
// //         {
// //             System.out.print(current.data+" ");
// //             current=current.next;
// //         }

// //     }
// //     public static void main(String[] args) {
// //         insertNodeAtEnd(2);
// //         insertNodeAtEnd(5);
// //         insertNodeAtEnd(7);
// //         insertNodeAtEnd(9);
// //         insertNodeAtEnd(25);
// //         printLList();
// //     }
// // }

// import java.util.LinkedList;

// /**
//  * InsertNodeAtEnd
//  */
// public class InsertNodeAtEnd {
//     static Node head=null;
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data)
//         {
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static void insertNode(int newData)
//     {
//         Node newNode = new Node(newData);
//         if(head==null)
//         {
//             head=newNode;
//             return ;
//         }
//         else{
//             Node temp=head;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             //temp.data=newData;
//             temp.next=newNode;
//         }

//     }
//     public  static void printPath()
//     {
//         Node current=head;
//         while(current.next!=null)
//         {
//             System.out.print(current.data+" ->");
//             current=current.next;
//         }
//     }
//     public static void main(String[] args) {
//         //LinkedList<Integer> lis = new LinkedList<>();
//         insertNode(10);
//         insertNode(20);
//         insertNode(30); 
//         insertNode(40);
//         printPath();
//     }
// }

class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            //head = new Node(newData);
            head = newNode;
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);
        llist.insertAtEnd(25);

        System.out.println("Linked List after successful insertion of all the nodes:");
        llist.printNodes();
        System.out.println();


    }
}




/*// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class LinkedList
{
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
    public void insertAtEnd(int newData)
    {
        Node newNode=new Node(newData);
        if(head==null)
        {
            head=new Node(newData);
        }
        Node temp=head;
        newNode.next=null;
        while(temp!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ->");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        LinkedList lis=new LinkedList();
        lis.insertAtEnd(1);
        lis.insertAtEnd(10);
        lis.insertAtEnd(5);
        lis.printList();
    }
}*/