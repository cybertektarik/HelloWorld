package eskiJavCalismalari;

import java.util.HashSet;
import java.util.Set;

public class EskiQniqueAndDoubleNum {
    public static void main(String[] args) {
        int nums[]={2,4,4,5,7,8,2,9,15,7,9,11,12,12,10,15};
        Set<Integer>set=new HashSet<>();
        for(int doubleNum:nums){
            if(set.add(doubleNum)==false){
                System.out.println("Cift Numaralar:"+doubleNum);
            }
        }
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                    break;

                }
            }
            if(count==0){
                System.out.println("This is Unique number:"+nums[i]);
            }
        }
    }
}
