
import java.util.Scanner;
public class Array_Basics {
    public static void main(String args[]){


        //declaration and allocating memory for an array of integers
        int arr[] = new int[3];

        // initializing array elements
        int arr1[] = { 1, 2, 3, 4, 5 };


        // accessing array elements
        System.out.println("First element: " + arr1[0]);
        System.out.println("Second element: " + arr1[1]);


        // accessing elements using for loop
        System.out.println("Elements of given array: ");
        for (int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);    


        // accessing elements using for-each loop
        System.out.println("Elements of given array (using for-each): ");
        for (int element : arr1) {
            System.out.println(element);
        }


        // taking input from user and storing it in an array
        int arr2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements for the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = sc.nextInt();
        }

        // displaying the elements of the second array
        System.out.println("Elements of the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
    
}
