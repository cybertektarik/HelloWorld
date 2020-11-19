package naveenJavaQuestion;

public class FactorialNumber {
    public static void main(String[] args) {
        // fact of 3=3*2*1=6
        //fact of 4=4*3*2*1=24
        System.out.println(factorial(4));
    }
    public static int factorial(int num){
        int fact=1;
        if(num==0)
            return -1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }

}
