package javaSorulari;

public class SwitchPractice {
    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(5);
        System.out.println(calculateInterest(1000.000,2.0));


    }
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("non of those days");
        }
    }
    public static double calculateInterest(double amount, double interstRate){
        return(amount*(interstRate/100));
    }

}
