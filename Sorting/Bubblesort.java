package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void bubbleSort(int[] arr){
        boolean swap= false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={24,43,21,11,90,45};
        bubbleSort(arr);
        System.out.println("Sorted arr is: ");
        System.out.println(Arrays.toString(arr));
    }


}
