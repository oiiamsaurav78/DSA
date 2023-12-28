package Hashmap;
import java.util.*;
public class hashmap326 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap=new HashMap<>();
        // HashMap<Integer, String> hashmap;
        hashmap.put(1,"Saurav");
        hashmap.put(2,"rohan");
        hashmap.put(3,"priya");
        hashmap.put(5,"Ram");
        System.out.println("Hashmap of givendata is :"+ hashmap);
        System.out.println(hashmap.get(2));
        System.out.println(hashmap.containsKey(3));;
        hashmap.remove(3);
        for(Map.Entry<Integer,String>e: hashmap.entrySet()){
            System.out.println("Hashmap is:");
            System.out.println(e.getKey()+" : " + e.getValue());
        }
        
        
    }
}
