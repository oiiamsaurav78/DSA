package Searching;

import java.util.Scanner;

public class Linearsearch298 {
    public static int LS(int[]arr,int x){
        int n=arr.length;
        int flag=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=i;
                break;
            }
        }
        return flag;
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
        int res=LS(arr, x);
        if(res!=-1){
            System.out.println("Element is found at : "+res);
        }else{
            System.out.println("element is not present ");
        }
    }
}
