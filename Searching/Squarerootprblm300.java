package Searching;

import java.util.Scanner;

public class Squarerootprblm300 {
    
    public static int squareRoot(int nums){
        int low=0,high=nums,result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if(val==nums){
                return mid;
            }
            else if(val<nums){
                result=mid;
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no you want to find the Square root: ");
        int x= input.nextInt();
        int res= squareRoot(x);
        System.out.println("The square root of no is : "+ res);
    }
}
