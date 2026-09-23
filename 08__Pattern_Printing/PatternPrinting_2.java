public class PatternPrinting_2 {
    public static void main(String args[]){


        // Pattern 1 : Solid Pyramid Pattern

        int rows = 4 ;

        for (int i = 1 ; i<= rows ; i++){
            // spaces 

            for (int j = 1 ; j <= rows -i ; j++){
                System.out.print("  ");
            }

            // stars 
            for (int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }

            // stars 

            for (int j = 1 ; j<= i-1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();


        // Pattern 2 : Solid Inverted Pyramid Pattern

        // rows 
        int n = 4 ;

        for (int i = 4 ; i >= 1 ; i--){

            // spaces 
            for (int j = 1 ; j <= n - i ; j++){
                System.out.print("  ");
            }

            // stars
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }

            // stars
            for (int j = 1 ; j <= i-1 ; j++){
                System.out.print("* ");
            }       

            System.out.println();
        }


        System.out.println();



        // Pattern 3 : Hollow Rectangle Pattern


        // Approach 1 : Basic 

        // row 1 
        for (int i = 1 ; i <=6 ; i++){
            System.out.print("* ");
        }
        System.out.println();

        // row 2 
        for (int i = 1 ; i <=2 ; i++){
            for (int j = 1 ; j <=6 ; j++){
                if (j == 1 || j == 6){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // row 3
        for (int i = 1 ; i <=6 ; i++){
            
            System.out.print("* ");
        }

        System.out.println();
        System.out.println();

        // Approach 2 : Using Nested Loops
        for (int i = 1 ; i<=4 ; i++){
            for (int j = 1 ; j<=6 ; j++){
                if (i ==1 || i== 4 ){
                    System.out.print("* ");
                }
                else {
                    if (j == 1 || j == 6){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();   
        }



    }
}
