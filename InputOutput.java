import java.util.Scanner;
import java.math.BigInteger;

public class InputOutput {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of firstNum: ");
        int firstNum = sc.nextInt();


        System.out.print("Enter the value of secondNum: ");
        int secondNum = sc.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is: " + sum);

        // Output : The sum of [firstNum] and [secondNum] is: [sum]


        // BigInteger input
        System.out.print("Enter a big integer value: ");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("The big integer value is: " + bg);

        // Output : The big integer value is: [bg]


        // boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean flag = sc.nextBoolean();
        System.out.println("The boolean value is: " + flag);

        // Output : The boolean value is: [flag]


        // short input
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();
        System.out.println("The short value is: " + s);

        // Output : The short value is: [s]


        // float input
        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.println("The float value is: " + f);

        // Output : The float value is: [f]s


        sc.close(); // Closing the scanner to prevent resource leak
        
    }
}
