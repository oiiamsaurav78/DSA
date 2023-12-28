package Queue;
import java.util.*;
public class deque345 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(2);
        deque.addFirst(4);
        deque.addFirst(5);
        System.out.println("The deque looks like "+ deque);
        System.out.println("top ele is "+deque.getFirst());;
        deque.removeLast();
        System.out.println(deque);
        
    }
}
