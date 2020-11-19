package eskiJavCalismalari;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("tarik","kirat"));

    }
    public static boolean isAnagram(String str,String str1){
        char[]char1=str.toCharArray();
        char[]char2=str1.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char1);
        if(Arrays.equals(char1,char2)){
            return true;
        }else {
            return false;
        }
    }
}
