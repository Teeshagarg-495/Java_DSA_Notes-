public class Loops {
    public static void main(String args[]){

        // for loop to print numbers from 1 to 10


        // Example 1 
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // output will be numbers from 1 to 10 printed on separate lines.


        // Example 2
        for(int i = 1; i <= 10; i++){
            System.out.println("Teesha");
        }

        // output will be "Teesha" printed 10 times on separate lines.


        // Example 3
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }

        // output will be numbers from 1 to 10 printed on the same line separated by spaces.


        // Example 4
        for(int i = 1; i <= 10; i+=2){
            System.out.print(i + " ");
        }

        // output will be odd numbers from 1 to 10 printed on the same line separated by spaces.

        // Example 5
        for(int i = 2; i <= 10; i+=2){
            System.out.print(i + " ");
        }
        
        // output will be even numbers from 2 to 10 printed on the same line separated by spaces.


        // Nested Loops
        

        // Example 6
        for(int i = 1; i <= 5; i++){  // rows 
            for(int j = 1; j <= 5; j++){ // columns 
                System.out.print("* ");
            }
            System.out.println();
        }

        // output will be a 5x5 grid of asterisks printed on separate lines.


        // Example 7
        for(int i = 1; i <= 5; i++){  // rows 
            for(int j = 1; j <= 5; j++){ // columns 
                System.out.println("i: " + i + ", j: " + j + "  ");
            }
        }
    }
}
