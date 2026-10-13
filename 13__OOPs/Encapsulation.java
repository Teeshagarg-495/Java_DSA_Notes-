public class Encapsulation {
    
    // Attributes 

    public int id;
    public String name;
    private int age;
    public int nos;
    private String gf; // private attribute


    //default constructor/ctor 

    public Encapsulation(){
        System.out.println("Default constructor called");
        //by default garbage values are assigned to the attributes
    }


    // parameterized constructor/ctor
    public Encapsulation(int id, String name, int age, int nos, String gf){
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }


    // copy constructor/ctor
    public Encapsulation(Encapsulation s){
        System.out.println("Copy constructor called");
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
        this.nos = s.nos;
    }


    //getter method for private attribute gf
    public String getGf() {
        return gf;
    }

    // setter 
    public String setGF(String gfname){
            this.gf = gfname ;
            return gf;
    }


    //getter for age 
    public int getAge(){
        return age;
    }

    //setter for age 
    public int setAge(int age){

        //extra layer of authentication
        if (age <100){
            this.age = age;
        }
        return age;
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

    private void gfchatting(){
        System.out.println(name + " is chatting with his girlfriend.");
    }
}
