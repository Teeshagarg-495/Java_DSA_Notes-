public class Pattern_Printing_6 {
    public static void main(String args[]){

        // Pattern 1 :
        for (int i =1 ; i <= 4 ; i++){
            for (int j = 1 ; j<= 4-i ; j++){
                System.out.print("  ");
            }

            char ch = 'A'; 

            for (int j = 1 ; j <= i ; j++){
                System.out.print(ch + " ");
                ch++;
            }

            ch--;

            for ( int j = 1; j <= i-1 ; j++){
                ch--;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
