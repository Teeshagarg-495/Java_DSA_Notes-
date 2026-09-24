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


        //Q4. create a method getmax(int a, int b) that returns the maximum of two integers
        int max = getmax(15, 20);
        System.out.println("The maximum of 15 and 20 is: " + max);

        //Q5. create a method calculatePercentage(int obtained, int total)
        int obtainedMarks = 80;
        int totalMarks = 100;
        int percentage = calculatePercentage(obtainedMarks, totalMarks);
        System.out.println("The percentage is: " + percentage + "%");


        //Q6. create an overload method display() that takes a String parameter and prints it, and another overload method display() that takes an int parameter and prints it
        display("Hello, World!");
        display(42);


        //Q7. write a method updateValue(int value) that takes an integer parameter and updates its value to 100. Print the value before and after calling the method to see if it has changed.
        int value = 50;
        System.out.println("Value before calling updateValue: " + value);
        updateValue(value);
        System.out.println("Value after calling updateValue: " + value);
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

    //Q4. create a method getmax(int a, int b) that returns the maximum of two integers
    static int getmax(int a, int b){
        return (a > b) ? a : b;
        // (condition) ? value_if_true : value_if_false;
    }

    //Q5. create a method calculatePercentage(int obtained, int total)
    static int calculatePercentage(int obtained, int total){
        if(total == 0){
            System.out.println("Total marks cannot be zero.");
            return 0;
        }
        return (obtained/total) * 100;
    }


    //Q6. create an overload method display() that takes a String parameter and prints it, and another overload method display() that takes an int parameter and prints it
    static void display(String message){
        System.out.println("String message: " + message);
    }

    static void display(int number){
        System.out.println("Integer number: " + number);
    }


    //Q7. write a method updateValue(int value) that takes an integer parameter and updates its value to 100. Print the value before and after calling the method to see if it has changed.
    static void updateValue(int value){
        System.out.println("Value before update: " + value);
        value = 100;
        System.out.println("Value after update: " + value);
    }

    
}
