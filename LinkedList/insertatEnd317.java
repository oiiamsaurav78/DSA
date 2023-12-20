package LinkedList;

import LinkedList.insertatmiddle319.Node;

class linkedList{
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
        public void insertAtEnd(int newdata){
            Node newNode= new Node(newdata);
            Node cycle=head;

            if(head==null){
                head= new Node(newdata);
                return;
            }
            newNode.next=null;
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            // while (cycle.next!=null) {
            //     cycle=cycle.next;
            // }
            // cycle.next=head;
            return;
            
        }
        public void deletion(int position){
            if(head==null){
                return;
            }
            Node temp=head;
            Node current= head;
            if(position==0){
                head=temp.next;
                return;
            }
            
            for(int i=0;current!=null && i<position-1;i++){
                current=current.next;
            }
            if(current==null || current.next==null){
                return;
            }
            else{
                current.next=current.next.next;
                System.out.println("inside delte");
            }

        

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
        public void reverseRR(Node current,Node prev){
            if(current.next==head){
                head=current;
                current.next=prev;
                return;
            }
            Node nextPtr=current.next;
            current.next=prev;
            reverseRR(nextPtr, current);
        }
        public void display(){
            Node current= head;
            while(current!=head){
                System.out.print(current.data+"--> ");
                current=current.next;
            }
        }
        public void cycleDetection(){
            Node slow=head,fast=head;
            int flag=0;
            while(slow!=null && fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    flag=1;
                    break;
                }
            }
            if (flag==1){
                System.out.println("Loop is detected.");
            }else{
                System.out.println("No loop");
            }
        }
        public void middleLL(){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            Node Middle=slow;
            System.out.println("The middle is: "+ slow.data);
        }

    }

public class insertatEnd317 {

   
    public static void main(String[] args) {
        linkedList llist= new linkedList();
        llist.insertAtEnd(2);
        llist.insertAtEnd(9);
        llist.insertAtEnd(10);
        llist.insertAtEnd(23);
        System.out.println("Before inserting at end: ");
        llist.display();
        llist.insertAtMiddle(25,10);
        System.out.println();
        System.out.println("After inserting 25: ");
        llist.display();
        System.out.println("");
        llist.deletion(3);
        llist.display();
        System.out.println();
        System.out.println("reverse of LL");
        llist.reverseLL();
        llist.display();
        System.out.println();
        System.out.println("using recursion");
        llist.prev=null;
        llist.reverseRR(llist.head,null);
        llist.display();
        // LinkedList.linkedList.Node temp=llist.head;
        // while(temp.next!=null){
        //     temp=temp.next;
        // }
        // temp.next=llist.head;
        // llist.cycleDetection();
        // llist.middleLL();
        

    }
        
}
