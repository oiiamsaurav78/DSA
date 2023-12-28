package Hashmap;
import java.util.*;

public class twosumProblm337 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the no of size of array: ");
        int n=input.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the ele at: ["+ i+"]");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);        
        }
        int []res={-1,-1};

        System.out.println("Enter the target: ");
        int target= input.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target && map.containsKey(0)){
                res[0]=i;
                res[1]=map.get(0);
            }
            else if(map.containsKey(target-arr[i])){
                if(map.get(target-arr[i])>i){
                    res[0]=i;
                    res[1]=map.get(target-arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(res));

    }
}
