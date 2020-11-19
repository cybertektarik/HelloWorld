package eskiJavCalismalari;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));

    }
    public static  boolean isPalindrome(String word){
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);

        }if(word.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}
