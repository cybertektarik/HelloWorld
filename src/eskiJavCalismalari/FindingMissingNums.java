package eskiJavCalismalari;

import java.util.ArrayList;
import java.util.Arrays;

public class FindingMissingNums {
    public static void main(String[] args) {
        int []num={3,5,8,10,13};
        int check=1;
        ArrayList<Integer>newNum=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            if(num[i]==check){
                check++;
                continue;
            }else {
                newNum.add(check);
                check++;
                i--;

            }
        }
            for(int j:newNum){
                System.out.print(j+ " ");
            }
    }
}
