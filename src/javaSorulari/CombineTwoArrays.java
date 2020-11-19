package javaSorulari;

public class CombineTwoArrays {
    public static void main(String[] args) {


        int[] arr1 = {2, 3, 4, 56, 7};
        int[] arr2 = {8, 9, 10, 11, 34, 54, 90};
        int[] newArr = new int[arr1.length+arr2.length];
        int index=0;
        for(int i=0;i< arr1.length;i++){
            newArr[index]=arr1[i];
            index++;
        }
        for(int i=0;i<arr2.length;i++){
            newArr[index]=arr2[i];
            index++;
        }
        for(int i=0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
