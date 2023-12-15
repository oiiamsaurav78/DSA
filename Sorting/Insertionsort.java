package Sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;


            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,54,64,23};
        insertionSort(arr);
        System.out.println("Sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
