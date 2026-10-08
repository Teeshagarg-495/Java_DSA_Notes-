public class CommonStringMethods {
    public static void main(String args[]){

        // length() method is used to get the length of the string. it will return the number of characters in the string.
        String name = "Teesha Garg";
        System.out.println("Length of the string is: " + name.length());

        // charAt() method is used to get the character at the specified index. it will return the character at the specified index.
        System.out.println("Character at index 0 is: " + name.charAt(0));
        System.out.println("Character at index 5 is: " + name.charAt(5));


        // == operator is used to compare the reference of the string. it will return true if both strings are pointing to the same string in the string pool otherwise false.
        String name1 = "Teesha";        
        String name2 = "Teesha";
        System.out.println("Comparing strings using == operator: " + (name1 == name2)); // true


        // .equals() method is used to compare the value of the string. it will return true if both strings have same value otherwise false.
        String name3 = "Teesha";
        String name4 = "teesha";
        System.out.println("Comparing strings using .equals() method: " + name3.equals(name4)); // false


        // .equalsIgnoreCase() method is used to compare the value of the string. it will return true if both strings have same value otherwise false.
        String name5 = "Teesha";    
        String name6 = "teesha";
        System.out.println("Comparing strings using .equalsIgnoreCase() method: " + name5.equalsIgnoreCase(name6)); // true


        // empty() method is used to check if the string is empty or not. it will return true if the string is empty otherwise false.
        String name7 = "";
        System.out.println("Checking if the string is empty or not using .isEmpty() method: " + name7.isEmpty()); // true
        String name8 = "Teesha";
        System.out.println("Checking if the string is empty or not using .isEmpty() method: " + name8.isEmpty()); // false


        // blank() method is used to check if the string is blank(only spaces or empty) or not. it will return true if the string is blank otherwise false.
        String name9 = "   ";
        System.out.println("Checking if the string is blank or not using .isBlank() method: " + name9.isBlank()); // true
        String name10 = "Teesha";
        System.out.println("Checking if the string is blank or not using .isBlank() method: " + name10.isBlank()); // false
        String name11 = "";
        System.out.println("Checking if the string is blank or not using .isBlank() method: " + name11.isBlank()); // true



        // trim() method is used to remove the leading and trailing spaces from the string. it will return a new string with the leading and trailing spaces removed.
        String name12 = "   Teesha Garg   ";
        System.out.println("String before using .trim() method: " + name12);
        System.out.println("String after using .trim() method: " + name12.trim());


        // upperCase() method is used to convert the string to upper case. it will return a new string with all the characters in upper case.
        String name13 = "Teesha Garg";
        System.out.println("String before using .toUpperCase() method: " + name13);
        System.out.println("String after using .toUpperCase() method: " + name13.toUpperCase());


        // lowerCase() method is used to convert the string to lower case. it will return a new string with all the characters in lower case.
        String name14 = "Teesha Garg";
        System.out.println("String before using .toLowerCase() method: " + name14);
        System.out.println("String after using .toLowerCase() method: " + name14.toLowerCase());



        // substring() method is used to get the substring of the string. it will return a new string which is a substring of the original string.
        String name15 = "My Name is Teesha Garg";
        System.out.println("String before using .substring() method: " + name15);
        System.out.println("Substring from index 11 to end: " + name15.substring(11));
        System.out.println("Substring from index 11 to 17: " + name15.substring(11, 17)); // 17 is exclusive    
        // endIndex is exclusive means it will not include the character at index 17. it will include the character at index 16.
        // beginIndex is inclusive means it will include the character at index 11. it will not include the character at index 10.



        // contains() method is used to check if the string contains the specified sequence of characters. it will return true if the string contains the specified sequence of characters otherwise false.
        String name16 = "My Name is Teesha Garg";
        System.out.println("Checking if the string contains the specified sequence of characters using .contains() method: " + name16.contains("Teesha")); // true
        System.out.println("Checking if the string contains the specified sequence of characters using .contains() method: " + name16.contains("teesha")); // false     
        System.out.println("Checking if the string contains the specified sequence of characters using .contains() method: " + name16.contains("Ga")); // true


        //valueOf() method is used to convert the specified value to string. it will return a new string which is the string representation of the specified value.
        int num = 10;
        System.out.println("Converting int to string using .valueOf() method: " + String.valueOf(num)); // "10"
        double num1 = 10.5;
        System.out.println("Converting double to string using .valueOf() method: " + String.valueOf(num1) + 1 ); // "10.51" 
        // here 1 is concatenated to the string "10.5" so the output will be "10.51" not "11.5"


        // startsWith() method is used to check if the string starts with the specified prefix. it will return true if the string starts with the specified prefix otherwise false.
        String name17 = "My Name is Teesha Garg";
        System.out.println("Checking if the string starts with the specified prefix using .startsWith() method: " + name17.startsWith("My")); // true
        System.out.println("Checking if the string starts with the specified prefix using .startsWith() method: " + name17.startsWith("my")); // false


        // endsWith() method is used to check if the string ends with the specified suffix. it will return true if the string ends with the specified suffix otherwise false.
        String name18 = "My Name is Teesha Garg";
        System.out.println("Checking if the string ends with the specified suffix using .endsWith() method: " + name18.endsWith("Garg")); // true
        System.out.println("Checking if the string ends with the specified suffix using .endsWith() method: " + name18.endsWith("  Garg")); // false
        // last is false because there is a space before "Garg" in the string but we are checking for "  Garg" which has two spaces before "Garg". so it will return false.


        //toCharArray() method is used to convert the string to a character array. it will return a new character array which contains all the characters of the string.
        String name19 = "Teesha Garg";
        char[] charArray = name19.toCharArray();
        System.out.println("Converting string to character array using .toCharArray() method: ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " , ");
        }


        //split() method is used to split the string into an array of strings based on the specified delimiter. it will return a new array of strings which contains all the substrings of the string.
        String name20 = "My Name is Teesha Garg";
        String[] strArray = name20.split(" "); // here we are splitting the string based on space. so the delimiter is space.
        System.out.println("\nSplitting string into an array of strings using .split() method: ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " , ");
        }

        String[] strArray1 = name20.split(" ", 3); // here we are splitting the string based on space. so the delimiter is space. and we are limiting the number of substrings to 3.
        System.out.println("\nSplitting string into an array of strings using .split() method with limit: ");
        for (int i = 0; i < strArray1.length; i++) {
            System.out.print(strArray1[i] + " , ");
        }


        //replace() method is used to replace the specified character or substring with the specified character or substring. it will return a new string which is the modified string.
        String name21 = "My Name is Teesha Garg";
        System.out.println("\nReplacing the specified character or substring with the specified character or substring using .replace() method: ");
        System.out.println("Replacing 'Teesha' with 'Tee': " + name21.replace("Teesha", "Tee")); // "My Name is Tee Garg"
    

        

    }
}
