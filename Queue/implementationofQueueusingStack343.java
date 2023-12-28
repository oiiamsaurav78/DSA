package Queue;
import java.util.*;
 class queueusingStack{
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();
    // insert data in stack1
    public  void enQueue(int data){
        stack1.push(data);
    }
    public  int deQueue(){
        int ele;
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                ele=stack1.pop();
                stack2.push(ele);
            }

        }
        // pop the ele from stack2;
        ele=stack2.pop();
        return ele;
    }

}
public class implementationofQueueusingStack343 {
    public static void main(String[] args) {
        queueusingStack q= new queueusingStack();
        q.enQueue(2);
        q.enQueue(4);
        
        System.out.println("The delted ele is : "+ q.deQueue());
    }
    
}
