public class Strings_Reverse {
    public static void main(String args[]){

        //q1. reverse the string using string builder

        String str = "Teesha garg";
        StringBuilder stringbuilder = new StringBuilder(str);

        stringbuilder.reverse();

        String reversedString = stringbuilder.toString();
        System.out.println("Reversed string using StringBuilder: " + reversedString);

    }
}
