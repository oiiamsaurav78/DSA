package arra1d;

import java.util.Scanner;

public class arr2d2prb {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int m= input.nextInt();
        System.out.println("Enter the no of column: ");
        int n= input.nextInt();
        int[][] arr= new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the element at ["+i+"]["+j+"]");
                int x= input.nextInt();
                arr[i][j]=x;
            }
        }
        int sum=0;
        int sum2=0;
        System.out.println(" Sum of diagonal element is:");
        for(int i=0;i<m;i++){
            sum+=arr[i][m-i-1];
        }
        System.out.println(sum);
        for(int i=0;i<m;i++){
            sum2+=arr[i][i];
        }
        System.out.println("sum of primary diagonal is"+sum2);
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum ele is : "+ max);
        // middle element of row and column;
        for(int i=0;i<m;i++){
            System.out.println(arr[i][n/2]);
            System.out.println(" ");
        }
         for(int i=0;i<n;i++){
            System.out.println(arr[m/2][i]);
            System.out.println(" ");
        }
    }
    
}
