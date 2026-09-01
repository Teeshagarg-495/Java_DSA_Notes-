public class Pattern_Printing_3 {
    public static void main(String args[]){

        // Pattern 1 : hollow right angled triangle pattern

        for (int i = 1 ; i<=5 ; i++){
            for (int j = 1 ; j <= 5 ; j++){

                if (i == 10 ){
                    System.out.print("* ");
                }
                else {
                    if (j == 1 || j == i){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2 : Hollow triangle pattern

        for (int i = 1 ; i<= 5 ; i++){

            for(int j = 1 ; j <= 5 ; j ++){
                if (i==5){
                    System.out.print("* ");
                }
                else {
                    if (j == 5-i+1 ){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }

            for (int j = 2 ; j<= i ; j++){
                if(i ==5){
                    System.out.print("* ");
                }
                else {
                    if (j == i){
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
