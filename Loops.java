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


        // Nested for Loops
        

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

        // output will be the values of i and j printed for each iteration of the nested loops.


        // break and continue keywords

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exit the loop when i is 5
            }
            System.out.println(i);
        }

        // output will be numbers from 1 to 4 printed on separate lines.


        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skip the rest of the loop when i is 5
            }
            System.out.println(i);
        }

        // output will be numbers from 1 to 10 printed on separate lines, except for 5 which will be skipped.


        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 ) {
                continue;
            }
            System.out.println(i);
        }

        // output will be even numbers from 1 to 10 printed on separate lines.



        // while loop 

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // output will be numbers from 1 to 10 printed on separate lines.


        // nested while loop
        int j = 1;
        while (j<=2 ){
            int k = 1 ;

            while (k<=3){
                System.out.println("j: " + j + ", k: " + k);
                k++;
            }
            j++;
        }

        // output will be the values of j and k printed for each iteration of the nested while loops.



        // do while loop
        int m = 1;
        do {
            System.out.println(m);
            m++;
        } while (m <= 10);

        // output will be numbers from 1 to 10 printed on separate lines.

        // do while loop is executed at least once even if the condition is false unlike while loop and for loop because the condition is checked after the execution of the loop body.
    }
}
