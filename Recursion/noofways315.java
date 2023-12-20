package Recursion;

import java.util.Scanner;

public class noofways315 {
    public static int noOfWays(int n){
        int res=0;
        if(n<=1){
            return n;
        }else{
            res= noOfWays(n-1)+noOfWays(n-2);
        }
        return res;
    }
    public static void main(String[] args) {
        // System.out.println("hello");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of stairs: ");
        int n= input.nextInt();
        System.out.println("The no of ways to reach "+ n+"stairs is :"+ noOfWays(n+1));
    }
}
