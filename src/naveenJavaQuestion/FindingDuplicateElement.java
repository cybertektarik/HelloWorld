package naveenJavaQuestion;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateElement {
    public static void main(String[] args) {
        String[] names={"Selenium","Tarik","Java","melda","Selenium","Tarik"};
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(names[i].equals(names[j])){
                    System.out.println(names[i]);
                }
            }
        }
        Set<String> store=new HashSet<>();
        for(String name:names){
            if(store.add(name)==false){
                System.out.println(name);
            }
        }
    }
}
