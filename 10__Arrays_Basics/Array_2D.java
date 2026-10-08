import java.util.Scanner;
public class Array_2D {
    public static void main(String args[]){


        // declarations 
        int arr[][];

        // allocation
        arr = new int[3][3];

        // initialization
        int brr[][] = { { 1, 2, 3 }, 
                        { 4, 5, 6 },
                        { 7, 8, 9 } 
                      };

        // accessing elements
        System.out.println(brr[0][0]);


        // accessing elements using for loop
        for (int i = 0 ; i < brr.length; i++){
            for (int j = 0; j < brr[i].length; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }



        // Can we allocate different amounts of memory for each row in a 2-D array, such that each row has a different number of columns?

        int[][] arr2 = new int[3][];

            arr2[0] = new int[2];   // Row 1 → 2 columns
            arr2[1] = new int[10];  // Row 2 → 10 columns
            arr2[2] = new int[5];   // Row 3 → 5 columns


            // taking input in a 2-D array from the user
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < arr2.length; i++){
                for (int j = 0; j < arr2[i].length; j++){
                    System.out.print("Enter the value for row " + i + " and column " + j + ": ");
                    arr2[i][j] = sc.nextInt();
                }
            }


            // printing the 2-D array
            System.out.println("The 2-D array is: ");
            for (int i = 0; i < arr2.length; i++){
                for (int j = 0; j < arr2[i].length; j++){
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }



    }
}
