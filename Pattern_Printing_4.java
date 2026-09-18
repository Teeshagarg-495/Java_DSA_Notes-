public class Pattern_Printing_4 {
    public static void main(String args[]){

        // Pattern 1 : hollow diamond pattern

        for (int i = 1 ; i<= 4 ; i++){
            for (int j = 4 ; j >= 1 ; j--){
                if (j == i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 2 ; j <= i ; j++)
            if(j == i){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
            System.out.println();
        }

        for (int i =3 ; i>=1; i--){
            for (int j = 4 ; j >= 1 ; j--){
                if (j == i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 2 ; j <= i ; j++){
                if (j == i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
