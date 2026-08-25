public class Conditionals {
    public static void main(String args[]){

        // if statement
        int dailyPractice = 12;

        if(dailyPractice > 10){
            System.out.println("You are doing great!");
        }

        // Output : You are doing great!

        // Example-> 2 

        int age = 20;
        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }

        // Output : You are eligible to vote.


        // if-else statement

        int marks = 75;
        if(marks >= 60){
            System.out.println("You have passed the exam.");
        } else {
            System.out.println("You have failed the exam.");
        }

        // Output : You have passed the exam.


        // Example-> 2
        int age1 = 15;
        if(age1  >= 18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Output : You are not eligible to vote.


        // if-else-if Ladder statement
        int accuracy = 85;
        if(accuracy >= 90){
            System.out.println("Excellent accuracy!");
        } else if(accuracy >= 80){
            System.out.println("Good accuracy!");
        } else if(accuracy >= 70){
            System.out.println("Average accuracy!");
        } else {
            System.out.println("Poor accuracy!");
        }


        // else is optional in if-else-if ladder statement. If none of the conditions are true, then no output will be printed.
        // Output : Good accuracy!


        // Example-> 2
        int day = 3;
        if(day == 1){   
            System.out.println("Monday");
        } else if(day == 2){          
            System.out.println("Tuesday");
        } else if(day == 3){    
            System.out.println("Wednesday");
        } else if(day == 4){    
            System.out.println("Thursday");
        } else if(day == 5){    
            System.out.println("Friday");
        } else if(day == 6){    
            System.out.println("Saturday");
        } else if(day == 7){    
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day!");
        }

        // Output : Wednesday


        // Nested if else Statement
        boolean hasSubscription = true;
        int solvedProblems = 15;

        if(hasSubscription){
            if(solvedProblems >= 10){
                System.out.println("You have access to premium content.");
            } else {
                System.out.println("You need to solve more problems to access premium content.");
            }
        } else {
            System.out.println("You need a subscription to access premium content.");
        }

        // Output : You have access to premium content.

        // Example-> 2
        int age2 = 25;
        char gender = 'M';

        if(gender == 'M'){
            if(age2 >= 18){
                System.out.println("You are eligible for the men's category.");
            }else {
                System.out.println("You are not eligible for the men's category.");
            }
        }else {
              System.out.println("You are not a male ");

              if(age2 >= 18){
                System.out.println("You are eligible for the women's category.");
              }else {   
                System.out.println("You are not eligible for the women's category.");   
              }
        }

        // Output : You are eligible for the men's category.


        // Ternary Operator
        int streakDays = 5;

        String status = (streakDays >=7)? ("Consistent") :("Irregular");
        System.out.println("Your streak status is: " + status);

        // Output : Your streak status is: Irregular



        // Switch Statement
        int dayOfWeek = 3;
        switch(dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day!");
        }

        // default case is optional in switch statement. If none of the cases match, then no output will be printed.

        // Output : Wednesday
    }
}
