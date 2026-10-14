package Inheritence;

public class Vehicle {
    
    public String name ;
    public String model;
    public int noOfTyres;


    // parameterized Constructor 

    public Vehicle(String name, String model , int noOfTyres){
        this.name = name ;
        this.model = model ;
        this.noOfTyres = noOfTyres;
    }


    // Attributes 

    public void startEngine(){
        System.out.println("Engine is starting of : " + name + " , " + model);
    }


    public void stopEngine(){
        
    }

    
}
