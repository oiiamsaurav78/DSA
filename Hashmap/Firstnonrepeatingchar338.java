package Hashmap;

import java.util.Scanner;
import java.util.*;
public class Firstnonrepeatingchar338 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s= input.nextLine();
        HashMap<Character,Integer> map= new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),s.charAt(i)+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        int flag=-1;
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                System.out.println("The index of first non repeating char is  "+  i);
                System.out.println(s.charAt(i));
                flag=1;
                break;
            }
        }
        if(flag==-1){
            System.out.println("No non repeating character.");
        }
    }
}
