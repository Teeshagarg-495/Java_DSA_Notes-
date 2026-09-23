public class Operators {
    public static void main(String[] args) {
        
        // Arithmetic Operators

        int solvedThisWeek = 10;
        int solvedLastWeek = 5;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int product = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println("Total Solved: " + total);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Remainder: " + remainder);

        // output:
        // Total Solved: 15
        // Difference: 5
        // Product: 40
        // Average: 1 --> Note: Integer division truncates the decimal part.
        // Remainder: 3


        // Relational Operators
        int currentStreak = 10;
        int targetStreak = 15;

        System.out.println(currentStreak > targetStreak); // false  
        System.out.println(currentStreak < targetStreak); // true
        System.out.println(currentStreak >= targetStreak); // false
        System.out.println(currentStreak <= targetStreak); // true
        System.out.println(currentStreak == targetStreak); // false
        System.out.println(currentStreak != targetStreak); // true


        // Logical Operators
        boolean completedDsa = true;
        boolean completedCore = false;

        System.out.println(completedDsa && completedCore); // false
        System.out.println(completedDsa || completedCore); // true
        System.out.println(!completedDsa); // false


        // Assignment Operators

        int ratingPoints = 10;

        ratingPoints += 5; // equivalent to ratingPoints = ratingPoints + 5
        System.out.println("Rating Points after addition: " + ratingPoints); // 15

        ratingPoints -= 3; // equivalent to ratingPoints = ratingPoints - 3
        System.out.println("Rating Points after subtraction: " + ratingPoints); // 12

        ratingPoints *= 2; // equivalent to ratingPoints = ratingPoints * 2
        System.out.println("Rating Points after multiplication: " + ratingPoints); // 24

        ratingPoints /= 4; // equivalent to ratingPoints = ratingPoints / 4
        System.out.println("Rating Points after division: " + ratingPoints); // 6


        // Unary Operators
        int x = 5;

        System.out.println("Value of x: " + x); // 5
        System.out.println("Negation of x: " + -x); // -5

        // pre increment and pre decrement
        System.out.println("Value of x after increment: " + ++x); // 6
        System.out.println("Value of x after decrement: " + --x); // 5

        // post increment and post decrement
        System.out.println("Value of x after post increment: " + x++); // 5
        System.out.println("Value of x after post decrement: " + x--); // 6


        // Ternary Operator
        int score = 85;
        String result = (score >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result); // Result: Pass


        //Instanceof Operator
        String name = "John Doe";
        System.out.println(name instanceof String); // true

       


        
    }
}
