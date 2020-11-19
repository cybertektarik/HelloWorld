package javaSorulari;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=scan.nextInt();
        int result =1;
        int q=num/10;
        while(q!=0){
            q=q/10;
            result++;

        }
        System.out.println(result);
    }
}
