package Recursion;

import java.util.Scanner;

public class fibbonaci309 {
    public static int fibb(int n){
        int result=0;
        if(n<=1){
            return n;
        }else{
            result= fibb(n-1)+fibb(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" Enter the no you want in fibb series: ");
        int n= input.nextInt();
        // fibb(n);
        System.out.println(" fibb no is : "+ fibb(n));
    }
}
