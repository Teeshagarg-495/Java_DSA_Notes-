public class PatternPrinting {
    public static void main(String args[]){

        // Pattern 1 : Solid Square Pattern

        for (int i = 0 ; i<4 ; i++){
            for (int j = 0 ; j<4 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Output will be a solid square pattern of 4x4 stars.


        System.out.println();


        // Pattern 2: Solid Rectangle Pattern

        for (int i = 0; i< 3 ; i++){
            for (int j = 0; j< 5 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Output will be a solid rectangle pattern of 3x5 stars.

        System.out.println();

        // Solid Right-Angled Triangle Pattern

        for (int i = 0 ; i < 5 ; i++){
            for (int j =0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Output will be a solid right-angled triangle pattern of stars with 5 rows.

        System.out.println();
    }
}
