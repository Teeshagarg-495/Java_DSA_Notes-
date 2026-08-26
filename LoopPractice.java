import java.util.Scanner;
public class LoopPractice {
    public static void main(String args[]){

        // print counting from 1 to n
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        // Output will be numbers from 1 to n printed on the same line separated by spaces.


        // print counting from n to 1
        System.out.print("\nEnter a number: "); 
        int m = sc.nextInt();
        for(int i = m; i >= 1; i--){
            System.out.print(i + " ");
        }

        // Output will be numbers from n to 1 printed on the same line separated by spaces.

        // print the 10 multiples of n 

        System.out.print("\nEnter a number: ");
        int p = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.print(p * i + " ");
        }

        // Output will be the 10 multiples of n printed on the same line separated by spaces.


        // print your name 100 times 
        for (int i = 1; i <= 100; i++){
            System.out.println("Teesha");
        }

        // Output will be "Teesha" printed 100 times on separate lines.

        // print all prime numbers 1 to 100 

}
}
