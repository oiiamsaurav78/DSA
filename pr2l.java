import java.util.Arrays;

public class pr2l {
    public static void main(String[] args) {
        int [] nums={ 1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k=3;
        int n=nums.length;
        // int arr[]=new int[n];
        for(int i=0;i<(n-k)/2;i++){
            int temp=nums[i];
            nums[i]=nums[n-k-i-1];
            nums[n-k-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=k+1;i<(n+k)/2;i++){
            int temp=nums[i];
            nums[i ]=nums[n-1];
            nums[n-1]=temp;

        }
        for(int i=0;i<n/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums ));

    }
}
