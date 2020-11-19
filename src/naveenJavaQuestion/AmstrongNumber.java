package naveenJavaQuestion;

public class AmstrongNumber {
    public static void main(String[] args) {
        //153
       // 1*1*1=1;
        // 5*5*5=125
        //3*3*3=27
       // 1+125+27=153
        isAmstrongnum(153);

    }
    public static void isAmstrongnum(int num){
        int r;
        int cube=0;
        int t;
        t=num;
        while(num>0){
            r=num%10;
            num=num/10;
            cube=cube+(r*r*r);
        }
        if(t==cube){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not Amstrong Number");
        }
    }

}
