package Queue;
import java.util.*;
class stackusingQueue{
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    // to add new ele in q1
    void add(int data){
        System.out.println("inside q1");
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
            System.out.println("inside adddeueue");
        }
        q1.add(data);
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }
    int remove(){
        if(q1.isEmpty()){
            System.out.println("Underflow");
            System.exit(0);
        }
        int ele=q1.peek();
        q1.poll();
        return ele;
    }


}

public class implemenataionofStackusingqueue344 {
    public static void main(String[] args) {
        stackusingQueue s=new stackusingQueue();
        System.out.println("jeeoo");
        s.add(2);
        System.out.println("added");
        s.add(4);
        s.add(32);
        System.out.println("The deleted ele is :"+ s.remove());
    }
}
