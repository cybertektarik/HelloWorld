package eskiJavCalismalari;

public class FactorialNum {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(facto(4));

    }
    public static int factorial(int num){
        if(num==1){
            return 1;
        }else{
            return num* factorial(num-1);
        }
    }
    public static int facto(int num){
        if(num==1){
            return 1;
        }
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;


        }
        return fact;
    }

}
