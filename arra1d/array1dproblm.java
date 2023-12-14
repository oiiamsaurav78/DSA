package arra1d;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class array1dproblm {
    public static void main(String[] args) {
        // Q1: Write a program to print the sum of all the elements present on even indices in the given array.
//          Input 1: arr[] = {3,20,4,6,9}
        // int n; Input 1: arr[] = {4,3,6,7,1}
        Scanner input= new Scanner(System.in);
        // System.out.println("enter the no of element of you want to enter");
        // int n=input.nextInt();
        // int[] arr= new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("enter the element in array; ");
        //     arr[i]=input.nextInt();
        // }
        // int sum=0;
        // int m=arr.length;
        // for(int i=0;i<m;i++){
        //     if(i%2==0){
        //         sum +=arr[i];
        //     }
        // }
        // System.out.println(sum);

        // // Q2: Write a program to traverse over the elements of the array using for each loop and print all even
        // // elements.
        // // Input 1: arr[] = {34,21,54,65,43}
        // // Output 1: 34 54
        // // Input 1: arr[] = {4,3,6,7,1}
        // // Output 1: 4 6
        // int[] arr2={34,21,54,65,43};
        // for(int eve:arr2){
        //     if(eve%2==0){
        //         System.out.println(eve);
        //     }
        // }
        // // Q3: Write a program to calculate the maximum element in the array.
        // // Input 1: arr[] = {34,21,54,65,43}
        // // Output 1: 65
        // // Input 1: arr[]
        // System.out.println("enter the no of element of you want to enter");
        // int m2=input.nextInt();
        // int[] arr3= new int[m2];
        // for(int i=0;i<m2;i++){
        //     System.out.println("enter the element in array; ");
        //     arr3[i]=input.nextInt();
        // }
        // int max=0;
        // for(int i=0;i<m2;i++){
        //     if(arr3[i]>max){
        //         max=arr3[i];
        //     }

        // }
        // System.out.println(max);

        // Q4: Write a program to find out the second largest element in a given array.
        // Input 1: arr[] = {34,21,54,65,43}
        // Output 1: 54
        // Input 1: arr[] = {4,3,6,7,1}
        // Output 1: 6
        int[] arr4={34,21,54,65,43};
        Arrays.sort(arr4);
        int l=arr4.length;

        System.out.println(arr4[l-2]);
        //Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
        // its just left and just right neighbor.
        // Input 1: arr[] = {1,3,2,6,5}
        // Output 1: 6
        int[]arr5={1,3,2,6,5};
        int l2=arr5.length;
        for(int i=1;i<l2-1;i++){
            if(arr5[i-1]<arr5[i] && arr5[i]>arr5[i+1]){
                System.out.println(arr5[i]+ "<---- peak element");
                break;

            }

        }



    }
}
