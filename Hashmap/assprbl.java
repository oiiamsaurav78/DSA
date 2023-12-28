package Hashmap;
import java.util.*;
public class assprbl {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
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
        // Given an array nums of size n, return the majority element.
        int[]arr2={1,2,3,4,9};
        HashSet<Integer> map= new HashSet<>();
        for(int i=0;i<arr2.length;i++){
            map.add(arr2[i]);
        }
        System.out.println(map);
        TreeSet<Integer> treeSet = new TreeSet<>(map);
        int ele= treeSet.last();
        System.out.println("Largest ele is "+ele);
        // Q5. Given two strings ransomNote and magazine, return true if ransomNote can be constructed
        // by using the letters from magazine and false otherwise.
        // Each letter in magazine can only be used once in ransomNote.
        TreeMap <Character,Integer> t1= new TreeMap<>();
        int[]nums={1,2,3,4,5};
        nums[0]=5;
        nums[2]=nums[3];
        System.out.println(Arrays.toString(nums));
    }

}
