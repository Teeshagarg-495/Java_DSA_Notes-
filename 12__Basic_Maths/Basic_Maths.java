public class Basic_Maths {
    public static void main(String args[]){

        // Q1. print digits of a number 
        int num = 12345;
        System.out.println("Digits of the number " + num + " are: ");
        printDigits(num);

        // Q2. count digits of a number
        int count = countDigits(num);
        System.out.println("Count of digits in the number " + num + " is: " + count);

        // Q3. Sum of digits of a number
        int sum = sumofDigits(num);
        System.out.println("Sum of digits in the number " + num + " is: " + sum);

        // Q4. Reverse of a number
        int reverse = reverseNumber(num);
        System.out.println("Reverse of the number " + num + " is: " + reverse);

        // Q5. check if a number is palindrome or not
        boolean isPalin = isPalindrome(num);
        if (isPalin){
            System.out.println("The number " + num + " is a palindrome.");
        } else {
            System.out.println("The number " + num + " is not a palindrome.");
        }


        // Q6. check if a number is prime or not
        boolean isPrimeNum = isPrime(11);
        if (isPrimeNum){
            System.out.println("The number " + num + " is a prime number.");
        } else {
            System.out.println("The number " + num + " is not a prime number.");
        }


        // Q7. check if a number is even or odd
        boolean isEvenNum = isEven(num);
        if (isEvenNum){
            System.out.println("The number " + num + " is an even number.");
        } else {
            System.out.println("The number " + num + " is an odd number.");
        }

    }

    //Q1. print digits of a number

    static void printDigits(int num){

        while (num >0){

            //modulo operator gives the last digit of the number
            int digit = num % 10;
            System.out.println(digit);

            //divide the number by 10 to remove the last digit
            num = num / 10;
        }
    }


    //Q2. count digits of a number

    static int countDigits(int num){
    int count =0 ;
    while (num >0){

        //divide the number by 10 to remove the last digit
        num = num / 10;
        count++;


    }
    return count;
}

    
     // Q3. Sum of digits of a number

     static int sumofDigits(int num){

        int sum =0;
        while (num >0){

            int ddigit = num %10;
            sum = sum + ddigit;
            num = num /10;
        }
        return sum;
     }


     // Q4. Reverse of a number

     static int reverseNumber(int num){

        int reverse =0;
        while (num >0){

            int digit = num %10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        return reverse;
     }


     //Q5. check if a number is palindrome or not

     static boolean isPalindrome(int num){

        int originalNum = num;
        int reverse =0;
        while (num >0){

            int digit = num %10;
            reverse = reverse * 10 + digit;
            num = num /10;
        }
        return originalNum == reverse;
     }


     //Q6. check if a number is prime or not

     static boolean isPrime(int num){

        if (num <=1 ){
            return false;
        }

        for (int i =2; i <= Math.sqrt(num); i++){

            if (num % i ==0){
                return false;
            }
        }
        return true;
     }

     //Q7. check if a number is even or odd

     static boolean isEven(int num){

        return num % 2 ==0;
     }


}
