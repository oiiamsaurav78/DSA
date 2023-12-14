package Searching;

import java.util.Scanner;

public class Binarysearch299 {
    public static int BS(int[] arr, int target){
        int low=0,high=arr.length-1;
        while(low<=high){
           int  mid=(low+(high-low)/2);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
                System.out.println(low);
            }else{
                high=mid-1;
                // System.out.println(high,"infintu");
                System.out.println(high +"infinth");
            }

        }
        return 0;
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
        int res=BS(arr, x);
        if(res==0){
            System.out.println("Element is found at : ");
        }else{
            System.out.println("element is not present " +res);
        }
    }
}
