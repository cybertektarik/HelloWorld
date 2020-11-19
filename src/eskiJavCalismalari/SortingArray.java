package eskiJavCalismalari;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] num={2,6,3,7,1,5,4};
        Arrays.sort(num);
        int newArr=num.length;
        System.out.println(num[newArr-2]);
        System.out.println(Arrays.toString(num));
        System.out.println(newArr);
    }
}
