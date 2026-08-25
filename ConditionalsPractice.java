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
    }
}
