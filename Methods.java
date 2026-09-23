public class Methods {
    public static void main(String args[]){

        System.out.println("Table of 2 :");

        // method calling
        printTableof2();
        System.out.println("Khatam !");

        // method calling with parameters
        printSum(10, 20);

        // calling void method with return type
        Multiply(10, 20);

        // calling non void method with return type
        // we need variable to store the return value of the method
        int result = divide(20, 10);
        System.out.println("Division of 20 and 10 is : " + result);

    }


    // method declaration and definition
    static void printTableof2(){
        for (int i = 0 ; i <=10 ; i++){
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }


    //Function with parameters
    static void printSum(int a, int b){
        System.out.println("Sum of " + a + " and " + b + " is : " + (a+b));
    }


    // void method with return type
    static void Multiply(int a, int b){
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a*b));
        return;

        // unreachable code
        // System.out.println("This is unreachable code");
    }


    // non void method with return type

    static int divide(int a, int b){
        return a/b;
    }
}
