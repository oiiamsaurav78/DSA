package LinkedList;

class Linkedlist{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;

        }
    }
    public void insertatend(int data){
        
        Node newnode= new Node(data);
        if(head==null){
            head= new Node(data);
            return;
        }
        newnode.next=null;
        Node temp=head;
        
        
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
                
    }
    public void search(int target){
        Node temp=head;
        int flag=0;
        while(temp.next!=null){
            if(temp.data==target){
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if (flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
    }
    public void palindrome(){
        Node reversehead=head;
        int count=0;
        Node temp1=head;
        Node curr=head;
        Node prev=null;
        Node nextptr=null;
        while(curr.next!=null){
            nextptr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextptr;
            count++;
        }
        System.out.println("the count is "+count);
        reversehead=prev;
        int flag=1;
        Node temp2=reversehead;
        while(count<count/2){
            if(temp1.data!=temp2.data){
                System.out.println("not palindrome");
                flag=0;
                break;
            }else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
            count++;
        }
        if(flag==1){
            System.out.println(" Yespalindrome");
        }
    }
    public int sumList(){
        Node temp= head;
        int sum=0;
        while(temp!=null){
            int rev=temp.data%10;
            sum=sum*10+rev;
            System.out.println("the sumis : "+sum);
            temp=temp.next;
        }
        System.out.println(sum+"the sum is ");
        return sum;
    }
    public void insertatstart(int newdata){
        Node newnode= new Node(newdata);
        while(newdata>0){
            int remi=newdata%10;
            Node remi2=new Node(remi);
            newdata=newdata/10;
            System.out.println(newdata+"is the 6");
            if(head==null){
                head=remi2;
            }else{
                remi2.next=head;
                head=remi2;
            }
            // newdata=newdata/10;
        }

    }
    public void deleteDuplicate(){
        Node temp=head;
        if(head==null){
            return ;
        }
        Node slow=head,fast=head.next;
        while (fast.next!=null){
            if(slow.data==fast.data){
                Node slow2=slow;
                slow2.next=fast.next;
                Node fast2= fast.next;
                fast.next=null;
                fast=fast2;
                slow=slow.next;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
    }
    public void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.next;
            
        }
    }

}

public class AssignmentLL {
    public static void main(String[] args) {
        Linkedlist ll= new Linkedlist();
        Linkedlist l2= new Linkedlist();
        Linkedlist l3= new Linkedlist();
        Linkedlist l4=new Linkedlist();
        l3.insertatend(8);
        l3.insertatend(4);
        l3.insertatend(2);

        l2.insertatend(5);
        l2.insertatend(6);
        l2.insertatend(3);

        ll.insertatend(14);
        ll.insertatend(21);
        ll.insertatend(11);
        ll.insertatend(11);
        ll.insertatend(21);
        ll.insertatend(14);
        ll.disp();
        System.out.println();
        ll.search(11);
        System.out.println();
        // ll.deleteDuplicate();
        ll.disp();
        // ll.palindrome();
        // ll.sumList();
        l2.disp();
        l2.sumList();
        l3.sumList();
        int res=l2.sumList() +l3.sumList();
        System.out.println(res);
        l4.insertatstart(res);
        l4.disp();

    }
  

    
}
