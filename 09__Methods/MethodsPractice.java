public class MethodsPractice {

    public static void main(String args[]){

        // Q1. Create a method printwelcomemessege() that prints a greeting 
        printwelcomemessege();

        // Q2. create a method add(int a , int b) that returns the sum of two integers
        int sum = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);


        // Q3. create a method isEven(int number) that returns true if the number is even, otherwise false
        int number = 4;
        if(isEven(number)){
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    // Q1. Create a method printwelcomemessege() that prints a greeting 
    static void printwelcomemessege(){
        System.out.println("Welcome to Java Programming !");
    }

    // Q2. create a method add(int a , int b) that returns the sum of two integers
    static int add(int a, int b){
        return a + b;
    }

    // Q3. create a method isEven(int number) that returns true if the number is even, otherwise false
    static boolean isEven(int number){
        return number % 2 == 0;
    }

    
}
