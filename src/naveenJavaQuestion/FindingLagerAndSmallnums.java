package naveenJavaQuestion;

import java.util.Arrays;

public class FindingLagerAndSmallnums {
    public static void main(String[] args) {
        int[]number={2,4,15,6,89,45,22,35};
        int small=number[0];
        int big=number[0];
        for(int i=0;i<number.length;i++){
            if(number[i]>big){
                big=number[i];
            }else if(number[i]<small){
                small=number[i];
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println(small+" "+big);
        // below using third variable cahnging value
int a=2;
int b=3;
int t;
t=a;
a=b;
b=t;
        System.out.println(a+" "+b);

    }
}
