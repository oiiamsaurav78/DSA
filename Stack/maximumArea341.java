package Stack;
import java.util.Arrays;
import java.util.Scanner;
public class maximumArea341 {
    public static void main(String[] args) {
        System.out.println("Enter the length of array: ");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at ["+i+"]");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // step 1 find prev smaller:
        int []prevsmaller=new int[n];
        for(int i=0;i<n;i++){
            int j=i;
            while(j>=0){
                if(arr[i]>arr[j]){
                    prevsmaller[i]=j;
                    // System.out.println(j+"[]"+i);
                    // j--;
                    break;
                }else{
                    prevsmaller[i]=-1;
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(prevsmaller));
        int[] nextSmaller=new int[n];
        for(int i=0;i<n;i++){
            int j=i;
            while(j<n){
                if(arr[i]>arr[j]){
                    nextSmaller[i]=j;
                    break;
                }
                else{
                    nextSmaller[i]=n;
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(nextSmaller));
        int area=0;
        for(int i=0;i<n;i++){
            int width=nextSmaller[i]-prevsmaller[i]-1;
            int area2=width*arr[i];
            if(area2>area){
                area=area2;
            }
        }
        System.out.println(area);
    }
}
