package Recursion;

import java.util.Scanner;

public class factorial308 {
    public static int fact(int n){
        int result=0;
        if(n<=1){
            return 1;
        }else{
            result= n*fact(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the no you  want factorial : ");
        int n= input.nextInt();
        System.out.println(fact(n));
        
    }
}
