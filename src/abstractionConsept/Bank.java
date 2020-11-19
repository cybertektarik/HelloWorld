package abstractionConsept;

public abstract class Bank {
    public abstract void loan(); // abstarct method -- no method body
    //partial abstraction
    //hiding the implementation
    //Astraction class can have abstraction methods and non abstarction method
    // YOU CANNOT CREATE OBJECT FROM INTERFACE CLASS

    // non absract method
    public  void credit(){
        System.out.println("Bank -- Credit");
    }

    public  void debit(){
        System.out.println("Bank -- Debit");

    }

}
