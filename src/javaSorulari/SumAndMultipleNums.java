package javaSorulari;

import java.util.Scanner;

public class SumAndMultipleNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please 2 numbers");
        int a=scan.nextInt();

        int b=scan.nextInt();
        int sum=0;
        int mul=1;
        if(a<b){
            for(int i=a+1;i<b;i++){
                sum=sum+i;
                mul=mul*i;
            }
            System.out.println("Sum "+sum+"mul "+mul);
        }
    }
}
