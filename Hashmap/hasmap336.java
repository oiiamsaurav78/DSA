package Hashmap;    
import java.util.*;

import javax.swing.tree.TreePath;

public class hasmap336 {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(3, "Priya");
        map.put(1, "Sneha");
        map.put(2, "Ram");
        map.put(7, "Kiran");
        System.out.println("Hashmap is : "+ map);  
        System.out.println("Linked hash map is: ");    
        LinkedHashMap<Integer,String> map2= new LinkedHashMap<>();
        map2.put(3, "Priya");
        map2.put(1, "Sneha");
        map2.put(2, "Ram");
        map2.put(7, "Kiran");
        System.out.println("LinkedHashmap is : "+ map2); 
        // TreeMap<Integer,String> map3= new TreePath<>();
        // map3.put(3, "Priya");
        // map3.put(1, "Sneha");
        // map3.put(2, "Ram");
        // map3.put(7, "Kiran");
        // System.out.println("LinkedHashmap is : "+ map3); 
    }    
}
