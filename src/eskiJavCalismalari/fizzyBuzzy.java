package eskiJavCalismalari;

public class fizzyBuzzy {
    public static void main(String[] args) {
        fizzyBuzzy(20);

    }
    public static void fizzyBuzzy(int num){
        for(int i=0;i<=num;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println("Kerem ve Melda ve Tarik");

            }else if(i%3==0){
                System.out.println("Kerem");
            }else if(i%5==0){
                System.out.println("Melda");
            }else{
                System.out.println(i);
            }
        }
    }
}
