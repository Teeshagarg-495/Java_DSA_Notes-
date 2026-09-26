public class Array_2D_Practice {
    public static void main(String args[]){

        //Q1. Print sum of all elements in a 2-D array
        int arr[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } 
                      };    

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }

        System.out.println("The sum of all elements in the 2-D array is: " + sum);


        //Q2. Print product of all elements in a 2-D array
        int product = 1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                product *= arr[i][j];
            }
        }

        System.out.println("The product of all elements in the 2-D array is: " + product);

        // Q3. Find the maximum element in a 2-D array

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The maximum element in the 2-D array is: " + max);


        // Q4. Find the minimum element in a 2-D array

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
            System.out.println("The minimum element in the 2-D array is: " + min);
    }
}
