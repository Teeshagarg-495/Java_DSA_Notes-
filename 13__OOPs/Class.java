public class Class {
    
    // Attributes 

    public int id;
    public String name;
    public int age;
    public int nos;


    //default constructor/ctor 

    public Class(){
        System.out.println("Default constructor called");
        //by default garbage values are assigned to the attributes
    }


    // parameterized constructor/ctor
    public Class(int id, String name, int age, int nos){
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }


    // copy constructor/ctor
    public Class(Class s){
        System.out.println("Copy constructor called");
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        this.nos = s.nos;
    }



    // Methods/ behaviors

    public void studying() {
        System.out.println(name + " is studying.");
    }

    public void sleeping() {
        System.out.println(name + " is sleeping.");
    }

    public void bunk(){
        System.out.println(name + " is bunking.");
    }
}
