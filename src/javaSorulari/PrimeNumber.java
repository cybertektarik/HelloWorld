package javaSorulari;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=scan.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                isPrime=false;
                break;

            }
        }
        if(isPrime){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
