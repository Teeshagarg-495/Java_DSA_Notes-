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



        // Pattern 2 : Butterfly pattern

        for (int i = 1 ; i <=4 ; i++){
            for (int j =1 ; j <=4 ; j ++){
                if (j <= i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 4 ; j>=1 ; j--){
                if (j <= i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = 4 ; i >=1 ; i--){
            for (int j = 1 ; j <=4 ; j ++){
                if (j <= i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 4 ; j>=1 ; j--){
                if (j <= i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();
        
        // Pattern 3 : Number right angle triangle
        for (int i = 1 ; i <=5 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}

