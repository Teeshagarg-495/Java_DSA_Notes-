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
    }
}
