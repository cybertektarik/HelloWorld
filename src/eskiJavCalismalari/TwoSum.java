package eskiJavCalismalari;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={3,5,4,7,9};
        int target=12;
        System.out.println(Arrays.toString(twoSum(arr,target)));

    }
    public static int []twoSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==target-arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
