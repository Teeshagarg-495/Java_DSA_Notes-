public class Pattern_Printing_5 {
    public static void main(String args[]){

        // Pattern 1 :
        int count =1 ;

        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }


        System.out.println();

        // Pattern 2 :

       
        for (int i = 1 ; i <= 5 ; i++){
             char ch = 'A' ;
            for (int j = 1 ; j <= i ; j++){
                System.out.print(ch + " ");
                ch++;
            }
            
            System.out.println();
        }

        System.out.println();

        // Pattern 3 :

        for (int i = 1 ; i <= 5 ; i++){
            char ch = 'E' ;
            for (int j = 1 ; j <= i ; j++){
                System.out.print(ch + " ");
                ch--;
            }
            
            System.out.println();
        }

        System.out.println();
        // Pattern 4 :

        for (int i = 4 ; i >= 1 ; i--){
            for (int j = 4 ; j >=1 ; j--){
                if(j <=i ){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 1 ; j <= i- 1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 1 ; i<= 3 ; i++){
            for(int j = 4 ; j>=1 ; j--){
                if(j <= i+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
