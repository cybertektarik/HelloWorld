package naveenJavaQuestion;

public class ReverseString {
    public static void main(String[] args) {
        String str="String";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
        System.out.println(str1);
        StringBuffer sf=new StringBuffer(str);
        System.out.println(sf.reverse());
    }



}
