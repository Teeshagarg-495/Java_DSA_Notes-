import java.util.Scanner;
public class ConditionalsPractice {
    
    public static void main(String args[]){

        // Take age input from user and check if the user is eligible to vote or not. (Age limit for voting is 18 years)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Output will depend on the user's input. If the user enters an age of 18 or above, it will print "You are eligible to vote." Otherwise, it will print "You are not eligible to vote."


        // Take input 5 subjects marks and print the overall percentage of the student 


        int marks1, marks2, marks3, marks4, marks5;
        System.out.print("Enter marks for subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        marks3 = sc.nextInt();
        System.out.print("Enter marks for subject 4: ");
        marks4 = sc.nextInt();
        System.out.print("Enter marks for subject 5: ");
        marks5 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (totalMarks / 500.0) * 100;
        System.out.println("Overall percentage: " + percentage + "%");

        // Output will depend on the user's input. It will print the overall percentage of the student based on the marks entered for 5 subjects.



        // Take input a lowercase character and print its uppercase version 

        char lowercaseChar;
        System.out.print("Enter a lowercase character: ");
        lowercaseChar = sc.next().charAt(0);
        char uppercaseChar = Character.toUpperCase(lowercaseChar);
        System.out.println("Uppercase version: " + uppercaseChar);

        // Output will depend on the user's input. It will print the uppercase version of the lowercase character entered by the user.


        //Take input a uppercase character and print its lowercase version

        char uppercaseCharInput;
        System.out.print("Enter an uppercase character: ");
        uppercaseCharInput = sc.next().charAt(0);
        char lowercaseCharOutput = Character.toLowerCase(uppercaseCharInput);
        System.out.println("Lowercase version: " + lowercaseCharOutput);

        // Output will depend on the user's input. It will print the lowercase version of the uppercase character entered by the user.


        // Take input 5 subjects marks, drop the least one and calculate the overall percentage of the student consedering only top 4 subjects marks, print it 

        int marks6, marks7, marks8, marks9, marks10;
        System.out.print("Enter marks for subject 1: ");
        marks6 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks7 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        marks8 = sc.nextInt();
        System.out.print("Enter marks for subject 4: ");
        marks9 = sc.nextInt();
        System.out.print("Enter marks for subject 5: ");
        marks10 = sc.nextInt();

        // solve without using array

        int minMarks = Math.min(marks6, Math.min(marks7, Math.min(marks8, Math.min(marks9, marks10))));
        int totalMarksTop4 = marks6 + marks7 + marks8 + marks9 + marks10 - minMarks;
        double percentageTop4 = (totalMarksTop4 / 400.0) * 100;
        System.out.println("Overall percentage considering top 4 subjects: " + percentageTop4 + "%");

        // Output will depend on the user's input. It will print the overall percentage of the student considering only the top 4 subjects marks after dropping the least one.
    }
}
