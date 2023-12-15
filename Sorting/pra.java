package Sorting;

public class pra {
    public static void main(String[] args) {
        int[]arr ={1,2,3,2,4,2,2,2,2};
        int n=arr.length;
        int x=n/2;
        
        for(int i=0;i<n;i++){
            int flag=0;
            int c=0;
            System.out.println(i);
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    // System.out.println(arr[i]+ arr[j]+ "equal :");
                    c=c+1;
                    // System.out.println(c+ " : c");
                }
                if(c>x){
                    System.out.println(arr[i]);
                    System.out.println("break1");
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                System.out.println("break2");
                break;
            }
        }

    }
}
