package javaSorulari;

public class SwappingTwoArrays {
    public static void main(String[] args) {
        int arr1[]={2,3,6,4,8,9,10};
        int arr2[]={4,8,10,12,34,56,17};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
        int[]arr3=new int[7];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];

        }
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr3[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr3[i];
        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+ " ");
        }


}
}
