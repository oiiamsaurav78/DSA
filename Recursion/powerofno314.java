package Recursion;

import java.util.Scanner;

public class powerofno314 {
    public static int power(int a,int b){
        int res=1;
        if(b==1){
            return a;
        }else{
            res= a*power(a, b-1);

        }
        return res;
    }
    public static double optimizedPower(int a, int b){
        int mid=0; double res=1 ;
        double finalres=1;
        if(b==1){
            return a;
        }else{
            mid=b/2;
            res= optimizedPower(a, mid);
            finalres= res*res;
            if(b%2==0){
                finalres= 1* finalres;
            }else{
                finalres=a*finalres;
            }
        }
        return finalres;
        // return finalres;


    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the no you want to find power");
        int a= input.nextInt();
        System.out.println("Enter the power:");
        int b= input.nextInt();
        System.out.println("The power is : " +power(a, b));
        System.out.println("The power of "+a+"^"+b+" is: "+ optimizedPower(a, b));
    }
}
