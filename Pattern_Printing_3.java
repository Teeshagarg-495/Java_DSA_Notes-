public class Pattern_Printing_3 {
    public static void main(String args[]){

        // Pattern 1 : hollow right angled triangle pattern

        for (int i = 1 ; i<=10 ; i++){
            for (int j = 1 ; j <= 10 ; j++){

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


        // Pattern 2 : Hollow triangle pattern
        

    }
}
