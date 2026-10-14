package Inheritence;

public class Vehicle {
    
    // attributes
    public String name ;
    public String model;
    public int noOfTyres;


    // default constructor 

    public Vehicle(){

    }
    // parameterized Constructor 

    public Vehicle(String name, String model , int noOfTyres){
        this.name = name ;
        this.model = model ;
        this.noOfTyres = noOfTyres;
    }


    // behaviours 

    public void startEngine(){
        System.out.println("Engine is starting of : " + name + " , " + model);
    }


    public void stopEngine(){
        System.out.println("Engine is stoping now of : " + name + " , " + model);
    }


    

    
}
