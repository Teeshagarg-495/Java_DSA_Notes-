public class Objects {
    public static void main(String args[]){

        //default constructor 

        Class A = new Class(); //object creation
        System.out.println("Student A's id: " + A.id);
        System.out.println("Student A's name: " + A.name);

        // setting values to the attributes of Student A
        A.id = 101;
        A.name = "John";
        A.age = 20;
        A.nos = 5;
        System.out.println("Student A's id after setting: " + A.id);
        System.out.println("Student A's name after setting: " + A.name);

        A.studying();
        A.sleeping();
        A.bunk();


        //parameterized constructor
        Class B = new Class(102, "Alice", 21, 3); //object creation
        System.out.println("Student B's id: " + B.id);
        System.out.println("Student B's name: " + B.name);
        System.out.println("Student B's age: " + B.age);
        System.out.println("Student B's nos: " + B.nos);


        // copy constructor
        Class C = new Class(B);
        System.out.println("Student C's id: " + C.id);
        System.out.println("Student C's name: " + C.name);
        System.out.println("Student C's age: " + C.age);
        System.out.println("Student C's nos: " + C.nos);

        C.studying();
        C.sleeping();
        C.bunk();
    }
}
