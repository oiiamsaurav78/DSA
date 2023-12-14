package Searching;

import java.util.Scanner;

public class lowerBoundprblm299 {
    public static int lB(int []arr, int target){
        int low=0,high=arr.length;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }   
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        System.out.print("Enter the no of element you want to enter in array: ");
        int m=input.nextInt();
        int []arr=new int[m];
        for(int i=0;i<m;i++){
            System.out.println("Enter the elment :"+ i);
            arr[i]=input.nextInt();
        }
        System.out.println("enter the target element :");
        int x=input.nextInt();
        int res=lB(arr, x);
        if(res!=-1){
            System.out.println("Element is found at : "+res);
        }else{
            System.out.println("element is not present ");
        }
    }
}
