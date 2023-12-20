package arra1d;

import java.util.Scanner;

public class arr2dprblm {
    public static int postiveNo(int[][]arr){
        int pn=0;
        int nn=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>0){
                    pn++;
                }
                else if(arr[i][j]<0){
                    nn++;
                }
                else{
                    zn++;
                }
            }
        }
        // return {pn ,nn,zn};
        // int []res={pn,nn,zn};
        return pn;
    }
     public static int negativeNo(int[][]arr){
        // int pn=0;
        int nn=0;
        // int zn=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                
                if(arr[i][j]<0){
                    nn++;
                }
                
            }
        }
        
        return nn;
    }
    public static int zeroNo(int[][]arr){
       
        int zn=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                
                if(arr[i][j]==0){
                    zn++;
                }
                
            }
        }
        
        return zn;
    }
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
        System.out.println("The no of +Ve no is: "+ postiveNo(arr));
        System.out.println("The no of -VE  no is: "+ negativeNo(arr));
        System.out.println("The no of Zero no is: "+ zeroNo(arr));



    }
}
