package Sorting;

import java.util.Arrays;

public class Selectionsort302 {
    public static void selctionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        int []arr={2,1,3,2,5,6,7,11,22,31,10};
        selctionSort(arr);
        System.out.println("sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
