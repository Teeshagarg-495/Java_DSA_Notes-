public class Array_Questions {
    public static void main(String args[]){

        //Q1. Reverse an array(Two Pointer Approach)

        int arr[] = { 1, 2, 3, 4, 5 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end ){
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        System.out.println("The reversed array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(); // for new line


        // Q2. Find target using Linear Search

        int target = 3;
        boolean found = false;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target found in the array.");
        } else {
            System.out.println("Target not found in the array.");
        }

        // Q3. find row wise sum of a 2-D array

        int arr2D[][] = { { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 } 
                      };

        for (int i =0 ; i < arr2D.length; i++){
            int rowSum = 0;
            for (int j = 0; j < arr2D[i].length; j++){
                rowSum += arr2D[i][j];
            }
            System.out.println("The sum of row " + i + " is: " + rowSum);
        }


        // Q4. find column wise sum of a 2-D array
        for (int j = 0; j < arr2D[0].length; j++){
            int colSum = 0;
            for (int i = 0; i < arr2D.length; i++){
                colSum += arr2D[i][j];
            }
            System.out.println("The sum of column " + j + " is: " + colSum);
        }

    }
}
