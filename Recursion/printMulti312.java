package Recursion;

import java.util.Scanner;

public class printMulti312 {
    public static void printMulti(int num, int k){
        if(k==1){
            System.out.println(num);
            return ;
        }else{
            printMulti(num, k-1);
            System.out.println(num+ " " + k);
            System.out.println(num*k);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number you want multiplication :");
        int num=input.nextInt();
        System.out.println("Enter the value of k: ");
        int k= input.nextInt();
        printMulti(num, k);

    }
}
