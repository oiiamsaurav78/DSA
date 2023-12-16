package Recursion;

import java.util.Scanner;

public class Alternatesumseries311 {
    public static int sum(int num){
        int res=0;
        if(num==0){
            return 0;
        }
        if(num%2==0){
            res= sum(num-1)-(num);
        }
        else{
            res=sum(num-1)+(num);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= input.nextInt();
        System.out.println(sum(num));
    }
}
