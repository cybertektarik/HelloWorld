package javaSorulari;

import java.util.Scanner;

public class SumAllPrimeNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your number");
        int a=scan.nextInt();
        int count=0;int large=0;
        boolean isPrime=true;
        for(int i=1;i<a;i++){
            isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && i!=2){
                count++;
                large=i;
                isPrime=false;

            }
        }
        System.out.println(count+" "+large);
    }
}
