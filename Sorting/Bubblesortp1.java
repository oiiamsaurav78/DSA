package Sorting;

import java.util.Arrays;

public class Bubblesortp1 {
    // in descending order using bubblesort.
    public static void bubbleSort(int[] arr){
        int pass=0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    pass++;
                }
            }
        }
        System.out.println(pass+"The no of pass is");
    }
    public static void selectionSortdes(int[]arr){
        int n=arr.length;
        int itr=0;
       
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                itr++;
                if(arr[min]<arr[j]){
                    min=j;

                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;


        }
        System.out.println("The no of itr is : "+itr);

    }
    public static void insertionSort(int[]arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,5,1,6,0};
        int[]arr2={3,5,1,6,0};
        int[]arr3={3,5,1,6,0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Using selection sort: ");
        // System.out.println(selectionSortdes(arr));
        selectionSortdes(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("using insertion sort: ");
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
