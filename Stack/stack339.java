package Stack;

// import java.util.Stack;

import java.util.*;
public class stack339 {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        // push the element;
        stack1.push(2);
        stack1.push(3);
        stack1.push(6);
        stack1.push(9);
        // print the topmost ele;
        System.out.println("The top most element is : "+ stack1.peek());
        // delete the top most element
        stack1.pop();
        System.out.println("The top most ele after deletion is : "+ stack1.peek());
        // searching the ele:
        System.out.println("The position of 2 is  "+stack1.search(2));
        System.out.println("The stack is empty or not "+ stack1.isEmpty());

        
    }
}
