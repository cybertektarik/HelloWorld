package eskiJavCalismalari;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Multilication {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num=input.nextInt();
        if(num<1 || num>10){
            System.out.println("Invalid number");
            return;
        }
        for(int i=1;i<=10;i++){
            int result=num*i;
            System.out.println(num+"*"+i+"="+result);

        }
    }
}
