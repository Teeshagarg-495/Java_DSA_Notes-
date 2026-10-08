public class Strings_Practice_2 {
    public static void main(String args[]){

        //Q1. Count consonants in a string

        String str = "Teesha Garg";
        int consonantCount = countConsonants(str);
        System.out.println("Number of consonants in the string: " + consonantCount);

        //Q2. Convert string to uppercase without using method

        String str2 = "Teesha Garg";
        String upperCaseString = convertToUpperCase(str2);
        System.out.println("Uppercase string: " + upperCaseString);


        //Q3. find frequency of a character in a string

        String str3 = "Teesha Garg";
        char ch = 'a';
        int frequency = findFrequency(str3, ch);
        System.out.println("Frequency of character '" + ch + "' in the string: " + frequency);


        //Q4 . Remove all spaces from a string

        String str4 = "Teesha    Garg";
        String stringWithoutSpaces = removeSpaces(str4);
        System.out.println("String without spaces: " + stringWithoutSpaces);


        //Q5. check if string contains only digits

        String str5 = "123456acb";
        boolean onlyDigits = containsOnlyDigits(str5);
        if (onlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contain only digits.");
        }


        //Q6. Count words in a sentence
        String str6 = "This is a sample sentence.";
        int wordCount = countWords(str6);
        System.out.println("Number of words in the sentence: " + wordCount);

    }


    //Q1.Count consonants in a string

    static int countConsonants(String str){

        int count =0 ;

        for (int i =0 ; i < str.length() ; i++){

            char c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                continue;
            }
            else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))  {
                count++;
            }
        }
        return count;
    }


    //Q2. Convert string to uppercase without using method

    static String convertToUpperCase( String str){

        // we are using stringbuilder because new string result would have taken more space in memory if we use string concatenation. Stringbuilder is mutable and takes less space in memory.
        StringBuilder upperCaseString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c -32); // Convert to uppercase
            }
            upperCaseString.append(c);
        }

        return upperCaseString.toString();
    }


    //Q3. find frequency of a character in a string

    static int findFrequency(String str, char ch){

        int count =0 ;
        for (int i =0 ; i <str.length() ; i++){

            char c = str.charAt(i);

            if (c == ch){
                count ++;
            }
        }
        return count ;
    }


    //Q4 . Remove all spaces from a string

    static String removeSpaces(String str){

        StringBuilder result = new StringBuilder();

        for (int i =0 ; i < str.length() ; i++){

            char c = str.charAt(i);

            if(c != ' '){
                result.append(c);
            }

            
        }
        return result.toString();
    }


    // Q5. check if string contains only digits

    static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false; // Found a non-digit character
            }
        }
        return true; // All characters are digits
    }


    // Q6. Count words in a sentence

    static int countWords(String sentence) {

        int count =0 ;

        sentence = sentence.trim(); // Remove leading and trailing spaces

        if (sentence.isEmpty()) {
            return 0; // No words in an empty string
        }

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == ' ') {
                count++;
            }
        }

        return count + 1; // Add 1 to count the last word
       
    }
}
