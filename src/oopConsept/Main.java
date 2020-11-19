package oopConsept;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle();
        System.out.println(vehicle1.getName()); // does not give any input beacuse I did not iniliaze it in vehicle class
        vehicle1.setName("city");
        System.out.println(vehicle1.getModel());


        Vehicle vehicle2=new Vehicle("Civic","Black","2012","Honda");

        System.out.println(vehicle2.color);
        vehicle2.setColor("Green");
        System.out.println(vehicle2.color);

    }
}
