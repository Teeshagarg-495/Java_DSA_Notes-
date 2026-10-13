public class Encapsulation_2 {
    public static void main(String args[]){

        //Encapsulation 

        Encapsulation A = new Encapsulation(1, "John", 20, 5, "Alice"  ); //object creation
        System.out.println("Student A's id: " + A.id);
        System.out.println("Student A's name: " + A.name);
        System.out.println("Student A's age: " + A.age);
        System.out.println("Student A's nos: " + A.nos);
        System.out.println("Student A's gf: " + A.getGf()); 

        A.setGF("Teesha");

        System.out.println("Student A's gf: " + A.getGf());

       

        A.studying();
        A.sleeping();
        A.bunk();
        // A.gfchatting(); 
        // private method cannot be accessed outside the class
    }
}
