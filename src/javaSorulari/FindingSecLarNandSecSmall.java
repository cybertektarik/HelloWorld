package javaSorulari;

public class FindingSecLarNandSecSmall {
    public static void main(String[] args) {
        int[]arr={5,50,34,1,6,56,82,4,101};
        int small=arr[0]; int large=arr[0];
        int s_small=-1; int s_large=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                s_small=small;
                small=arr[i];
            }
            if(arr[i]>large){
                s_large=large;
                large=arr[i];
            }
        }
        System.out.println(s_small + " "+s_large);

    }
}
