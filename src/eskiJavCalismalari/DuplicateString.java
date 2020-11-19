package eskiJavCalismalari;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        String []str={"Melda","Tarik","Cuneyt","Selim","Tarik","Tom","Eric","Melda"};
        Set<String>container=new HashSet<>();
        for(String str1:str){
            if(container.add(str1)==false){
                System.out.println(str1);
            }
        }
    }
}
