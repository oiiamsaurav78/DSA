package LinkedList;

public class insertatmiddle319 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertAtMiddle(int newData,int target){
        Node newNode= new Node(newData);
        Node temp=head;
        while(temp.data!=target){
            temp=temp.next;
        }
        Node tempNext=temp.next;
        temp.next=newNode;
        newNode.next=tempNext;
    }
    public void disp(){
        
    }
}
