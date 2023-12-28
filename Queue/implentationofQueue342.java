package Queue;
import java.util.*;
public class implentationofQueue342 {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<9;i++){
            q.add(i);
        }
        // Queue looks like
        System.out.println("Queue looks like : "+q);
        // top ele
        System.out.println("Top ele is :"+q.peek());
        // del ele
        int x=q.remove();
        System.out.println("delted ele is : "+x);
        System.out.println("Size of queue is :"+q.size());
        
    }
}
