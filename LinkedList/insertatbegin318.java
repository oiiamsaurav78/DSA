package LinkedList;

public class insertatbegin318 {
    
    
    Node head;
    class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
        }
    }
    
    public  void insertAtBegin(int newdata){
        Node newNode=new Node(newdata);
        newNode.next=head;
        head=newNode;

    }
    public void reverseLL(){
        Node current= head;
        Node prev= null;
        Node nextPtr=null;
        while(current!=null){
            nextPtr=current.next;
            current.next=prev;
            prev=current;
            current=nextPtr;
        }
        head=prev;
    }
    public void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
    }
    public static void main(String[] args) {
        // insertAtBegin(21)
        insertatbegin318 llist= new insertatbegin318();
        llist.insertAtBegin(21);
        llist.insertAtBegin(12);
        llist.disp();
        
    }
}
