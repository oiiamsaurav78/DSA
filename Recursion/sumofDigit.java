package Recursion;

import java.util.Scanner;

public class sumofDigit {
    public static int sumDigit(int num){
        int result=0;
        if(num==0){
            return 0;

        }else{
            result= num%10 +sumDigit(num/10);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        System.out.println("The sum of digit is: "+ sumDigit(num));

    }
}
