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
        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
        // Output will be all prime numbers from 1 to 100 printed on the same line separated by spaces.


        System.out.println();

        // print all even numbers from 1 to 100
        for (int i = 2; i <= 100; i+=2){
                System.out.print(i + " ");
        }


        // Output will be all even numbers from 1 to 100 printed on the same line separated by spaces.

        System.out.println();

        // print the sum of all numbers from 1 to n
        System.out.print("\nEnter a number: ");
        int q = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= q; i++){
            sum += i;
        }   

        System.out.println("The sum of all numbers from 1 to " + q + " is: " + sum);

        // Output will be the sum of all numbers from 1 to n printed on the same line.

        System.out.println();

        // print all integers in range from 50 to 100, that are perfectly divisible by 7
        System.out.println("Integers from 50 to 100 divisible by 7:");
        for (int i = 50; i <= 100; i++){
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }

        // Output will be all integers from 50 to 100 that are perfectly divisible by 7 printed on the same line separated by spaces.

}
}
