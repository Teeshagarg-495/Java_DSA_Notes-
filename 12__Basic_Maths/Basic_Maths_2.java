public class Basic_Maths_2 {
    public static void main(String args[]){

        //Q1. calculate gcd of two numbers
        int a = 12;
        int b = 18;
        int gcd = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

        //Q2. calculate lcm of two numbers
        int lcm = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + "  is: " + lcm);


        // Q3. Armstrong number check
        int num = 153;
        boolean isArmstrongNum = isArmstrong(num);
        if (isArmstrongNum){
            System.out.println("The number " + num + " is an Armstrong number.");
        } else {
            System.out.println("The number " + num + " is not an Armstrong number.");
        }

        // Q4. Factorial of a number
        int num2 = 5;
        int fact = factorial(num2);
        System.out.println("Factorial of " + num2 + " is: " + fact);

        // Q5. Power of a number
        int base = 2;
        int exponent = 3;
        int powerResult = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);

        // Q6. Perfect number check
        int num3 = 6;
        boolean isPerfectNum = perfectNumber(num3);
        if (isPerfectNum){
            System.out.println("The number " + num3 + " is a perfect number.");
        } else {
            System.out.println("The number " + num3 + " is not a perfect number.");
        }


        // Q7. Print all prime numbers from 1 to n
        int n = 20;
        System.out.println("Prime numbers from 1 to " + n + " are: ");
        printAllPrimes(n);

        System.out.println(); // for a new line after printing all primes


        // Q8. Count number of even digits in a number
        int num4 = 123456;
        int evenDigitCount = countEvenDigits(num4);
        System.out.println("Count of even digits in the number " + num4 + " is: " + evenDigitCount);
    }

    //Q1. calculate gcd of two numbers
    static int gcd(int a, int b){

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    //Q2. calculate lcm of two numbers
    static int lcm(int a, int b){

        return (a * b) / gcd(a, b);
    }  
    
    
    // Q3. Armstrong number check
    static boolean isArmstrong(int num){

        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num);

        while (num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }


    static int countDigits(int num){

        int count = 0;
        while (num > 0){
            num /= 10;
            count++;
        }
        return count;
    }


    //Q4. calculate factorial of a number
    static int factorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    //Q5. find power of a number
    static int power(int base, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++){
            result *= base;
        }
        return result;
    }


    //Q6. find divisors or check perfect number

    static boolean perfectNumber(int num){

        int sum =0 ; 

        for (int i = 1 ; i <= Math.sqrt(num) ; i++){

            if (num % i == 0){
                int firstDivisor = i;
                int secondDivisor = num / i;    

                sum += firstDivisor;
                if (firstDivisor != secondDivisor && secondDivisor != num){
                    sum += secondDivisor;
                }
            }
        }

        return sum == num;
    }


    // Q7. print all prime number 1 to n 

    static void printAllPrimes(int n){

        for (int i = 2; i <= n; i++){

            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num){

        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++){

            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    //Q8. Count number of even digits in a number

    static int countEvenDigits(int num){

        int count = 0;
        while (num > 0){

            int digit = num % 10;
            if (digit % 2 == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
