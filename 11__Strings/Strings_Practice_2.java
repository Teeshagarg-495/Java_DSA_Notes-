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
}
