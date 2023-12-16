package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class binartySearch313 {
    public static int binarySearch(int[]arr,int low,int high,int x){
        int result=-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                return binarySearch(arr, mid+1, high, x);
            }
            else{
                return binarySearch(arr, low, mid-1, x);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner( System.in);
        System.out.println("Enter the no of element you want to enter in arr: ");
        int n= input.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element in: "+ i);
            int j= input.nextInt();
            arr[i]=j;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element you want to search in arr: ");
        int x= input.nextInt();
        int low=0;
        int high=n-1;
        System.out.println(binarySearch(arr, low, high, x));
    }
}
