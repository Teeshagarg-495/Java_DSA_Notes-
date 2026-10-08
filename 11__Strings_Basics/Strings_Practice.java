public class Strings_Practice {
    public static void main(String args[]){

        //Q1. print each character of the string 
        printEachCharacter("Teesha Garg");


        // Q2. Count length of the string without using length() method
        String str = "Teesha Garg";
        int length = countLength(str);
        System.out.println("Length of the string: " + length);


        //Q3. Count vowels in the string
        int vowelCount = countVowels("Teesha Garg");
        System.out.println("Number of vowels in the string: " + vowelCount);


        //Q4. Reveerse the string
        String reversedString = reverseString("Teesha Garg");
        System.out.println("Reversed string: " + reversedString);

        //Q5. check if string is palindrome or not
        boolean isPalin = isPalindrome("racecar");
        System.out.println("Is the string a palindrome? " + isPalin);
    }

       //Q1. print each character of the string 

       static void printEachCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }


        // Q2. Count length of the string without using length() method
        static int countLength(String str) {
            int count = 0;
             
             for (char c : str.toCharArray()) {
                count++;
             }
             return count;
        }


        //Q3. Count vowels in the string

        static int countVowels(String str){

            int count =0;
            for (int i=0 ; i < str.length() ; i++){

                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                    count++;
                }
            }
            return count;
        }

        //Q4. Reverse the string
        static String reverseString(String str){
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            return reversed;
        }


        //Q5. check if string is palindrome or not

        static boolean isPalindrome(String str) {
            String reversed = reverseString(str);
            return str.equals(reversed);
        }

        



}