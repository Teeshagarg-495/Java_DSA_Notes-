import java.util.Scanner;

public class Strings {
    public static void main(String args[]){

        String firstname = "Teesha";
        String lastname = new String("garg");

        System.out.println(firstname + " " + lastname); 
    
        // accessing characters from string
        System.out.println(firstname.charAt(0));
        System.out.println(lastname.charAt(0));

        // length of string
        System.out.println(firstname.length());
        System.out.println(lastname.length());


        // Accessing charcaters from string using for loop
        for (int i =0 ; i <firstname.length(); i++){
            System.out.println(firstname.charAt(i));
        }


        // Strings are immutable in java
        String name = "Teesha";
        name = name + " Garg"; // here a new string is created and the reference of name is changed to the new string
        System.out.println(name);


        // comparing strings

        String name1 = "Teesha";
        String name2 = "Teesha";

        if (name1 == name2){
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }

         // why? - because both name1 and name2 are pointing to the same string in the string pool. it does 
         // not check the value of the string but checks the reference of the string. if both references are same then it will return true otherwise false.


         // .equals() method is used to compare the value of the string. it will return true if both strings have same value otherwise false.
         // it is case sensitive. if both strings have same value but different case then it will return false.
         if(name1.equals(name2)){
            System.out.println("Both strings are equal");
         } else {
            System.out.println("Both strings are not equal");
         }


         // .equalsIgnoreCase() method is used to compare the value of the string. it will return true if both strings have same value otherwise false.
        // it is not case sensitive. if both strings have same value but different case then it will return true.

            if(name1.equalsIgnoreCase(name2)){
                System.out.println("Both strings are equal");
            } else {
                System.out.println("Both strings are not equal");
            }


            // input of String from user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");    
            String name8 = sc.nextLine();
            System.out.println("Hello, " + name8);


            // diff bw next() and nextLine() method of Scanner class
            System.out.print("Enter your first name: ");
            String firstName = sc.next(); // it will take input till space is encountered
            System.out.print("Enter your last name: ");
            String lastName = sc.next(); // it will take input till space is encountered
            System.out.println("Hello, " + firstName + " " + lastName);

            sc.nextLine();

            System.out.print("Enter your full name: ");
            String fullName = sc.nextLine(); // it will take input till enter is pressed
            System.out.println("Hello, " + fullName);
    }
}
