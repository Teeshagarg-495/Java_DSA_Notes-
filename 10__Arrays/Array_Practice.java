public class Array_Practice {
    public static void main(String args[]){

        //Q1. print the sum of all the elements of an array
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i =0 ; i < arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " + sum);


        // Q2. Multiply all the elements of an array
        int arr2[] = {1, 2, 3, 4, 5};
        int product = 1;
        for (int i =0 ; i < arr2.length; i++){
            product *= arr2[i];
        }

        System.out.println("Product of all elements: " + product);


        // Q3. Find the maximum element in an array
        int arr3[] = {1, 2, 3, 4, 5};
        int max = arr3[0];

        for (int i =0 ; i < arr3.length; i++){
            if (arr3[i] > max){
                max = arr3[i];
            }
        }
        System.out.println("Maximum element: " + max);


        // Q4. Find the minimum element in an array
        int arr4[] = {1, 2, 3, 4, 5};
        int min = arr4[0];
        for (int i =0 ; i < arr4.length; i++){
            if (arr4[i] < min){
                min = arr4[i];
            }
        }
        System.out.println("Minimum element: " + min);


        


    }
}
    

