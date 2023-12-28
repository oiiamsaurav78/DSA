package Hashmap;

import java.util.Arrays;

public class prb {
    public static void main(String[] args) {
        int[][]points={{8,7},{9,9},{7,4},{9,7}};


        int n= points.length;
        int[] x=new int [n];
        for(int i=0;i<n;i++){
            System.out.println(points[i][0]);
            x[i]=points[i][0];
            System.out.println(x[i]);
        }
        System.out.println(Arrays.toString(x));
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         System.out.println(x[j]+","+x[j+1]);
        //         if(x[j]<x[j+1]){
        //             int temp=x[j];
        //             System.out.println(temp);
        //             x[j]=x[j+1];
        //             x[j+1]=temp;
        //         }
        //         System.out.println(Arrays.toString(x));
        //     }
        // }
        Arrays.sort(x);
        // System.out.println(Arrays.toString(points));
        int diff=0;
        System.out.println(Arrays.toString(x));
        for(int i=0;i<x.length-1;i++){
            if((x[i]-x[i+1])>diff){
                diff=x[i]-x[i+1];
            }


        }
        System.out.println(diff);
    }
}
