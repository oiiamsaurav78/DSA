package Hashmap;
import java.util.*;

public class assignmentprblm {
    public static void main(String[] args) {
        // Q1. Implement a Map in java which takes the input and print the list in sorted order based on key.
        // TreeMap<Integer, String> h1= new TreeMap<>();
        // h1.put(5,"Rahul");
        // h1.put(7,"lakshman");
        // h1.put(1,"Ram");
        // h1.put(4,"krrish");
        // h1.put(2,"Lakshya");
        // System.out.println(h1);
        // Q2. Implement a Map in java which takes the input and print the list in sorted order based on value
        Scanner input=  new Scanner(System.in);
        // System.out.println("Enter the no of key value pair");
        // int n= input.nextInt();
        // TreeMap<String,Integer> map= new TreeMap<>();
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter your key- value pair ");
        //     int x= input.nextInt();
        //     String s= input.next();
        //     map.put(s, x);
        // }
        // System.out.println(map);
        // Q3.Detect if an Array contains a duplicate element. At Most 1 duplicate would be there.
        System.out.println("Enter the size of arr: ");
        int n=input.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at ["+i+"]");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        HashSet<Integer> h2= new HashSet<>();
        int flag=-1;
        for(int i=0;i<n;i++){
            if(h2.contains(arr[i])){
                System.out.println("Yes");
                flag=1;
                break;
            }else{
                h2.add(arr[i]);
            }

        }
        if(flag==-1){
            System.out.println("no duplicate");
        }
    }
}
