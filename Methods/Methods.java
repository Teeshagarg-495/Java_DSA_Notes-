public class Methods {

    static int hello= 10;
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

        // method overloading
        int sum1 = add(10, 20);
        System.out.println("Sum of 10 and 20 is : " + sum1);
        int sum2 = add(10, 20, 30);
        System.out.println("Sum of 10, 20 and 30 is : " + sum2);


        // call by value
        int a = 10;
        System.out.println("Value of a before method call : " + a);
        callByValue(a);
        System.out.println("Value of a after method call : " + a);


        // scope of variable
        // System.out.println(val); // this will give error as val is not defined in this scope

        // will not give error as hello is defined in class scope
        System.out.println(hello); 
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


    // Method overloading
    static int add(int a, int b){
        return a+b;
    }

    static int add (int a, int b, int c){
        return a+b+c;
    }


    // failed case of method overloading

    // static int add(int a, int b){
    //     return a+b;
    // }

    // static float add(int a, int b){
    //     return a+b;      
    // }



    // call by value 
    static void callByValue(int a){
        a = a + 10;
        System.out.println("Value of a inside method : " + a);
    }


    // scope of variable
    static void printMultiples(){

        System.out.println(hello); // will not give error as hello is defined in class scope
        int val = 20;
        for (int i = 1; i <= 10; i++){
            System.out.println(val + " * " + i + " = " + val*i);
        }

    }
}
