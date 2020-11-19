package eskiJavCalismalari;

public class SubstringPracrice {
    public static void main(String[] args) {
        String str="Allah Kerim";
        String newArr=" ";
        String []str1=str.split(" ");
        for(int i=0;i<str1.length;i++){
            str1[i]=str1[i].substring(str1[i].length()-1)+
                    str1[i].substring(1,str1[i].length()-1)+
                    str1[i].substring(0,1);
            newArr+=str1[i]+" ";

        }
        newArr.trim();
        System.out.println(newArr);
    }
}
