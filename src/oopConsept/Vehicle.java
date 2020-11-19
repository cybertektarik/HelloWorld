package oopConsept;

public class Vehicle {
    public String name="";
    public String color="";
    public String model="";
    public String company="";

    public Vehicle(){

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public Vehicle(String name, String color, String model, String company){
        this.name=name;
        this.color=color;
        this.model=model;
        this.color=color;

    }
    public  void setName(String name){
    this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void  setModel(String model){
        this.name=name;
    }
    public void setCompany(String company){
        this.name=name;
    }

}
