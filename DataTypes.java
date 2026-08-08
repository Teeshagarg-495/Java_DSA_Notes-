public class DataTypes {
    public static void main(String args[]){

        // Numeric Data Types - short , byte , int , long 

         byte b = 10;
         System.out.println("Byte Value: " + b);
         // output: Byte Value: 10

         byte b1 = 127;
         System.out.println("Byte Value: " + b1);
         // output: Byte Value: 127

         // implicit typecasting
         long l1 = b1;
         System.out.println("Long Value: " + l1);
         // output: Long Value: 127

         // Error Case :
        //  byte b2 = 128;
        //  System.out.println("Byte Value: " + b2);
        //  output: Error: incompatible types: possible lossy conversion from int to byte

        short s = 1000;
        System.out.println("Short Value: " + s);
        // output: Short Value: 1000


        // Error Case :
        //  short s1 = 40000;
        //  System.out.println("Short Value: " + s1);
        //  output: Error: incompatible types: possible lossy conversion from int to short

        int i = 100000;
        System.out.println("Integer Value: " + i);
        // output: Integer Value: 100000

        long l = 100000;
        System.out.println("Long Value: " + l);
        // output: Long Value: 100000



        // Floating Point Data Types - float , double

        float f = 10.545456f;
        System.out.println("Float Value: " + f);
        // output: Float Value: 10.545456
        // upto 6 decimal places, does not round off the value.


        double d = 10.5454567897897897987870980987;
        System.out.println("Double Value: " + d);
        // output: Double Value: 10.54545678978979
        // upto 14 decimal places, does not round off the value.



        // Character Data Type - char
        char c = 'A';
        System.out.println("Character Value: " + c);

        //typecasting 
        System.out.println("Character Value: " +(char)(c+1));
        // output: Character Value: A


        // Boolean Data Type - boolean
        boolean eligibleToVote = true;
        System.out.println("Boolean Value: " + eligibleToVote);
        // output: Boolean Value: true


        // explicit typecasting
        long l2 = 1000009898;
        int i2 = (int) l2;
        System.out.println("Integer Value: " + i2);
        // output: Integer Value: 1000009898






    }
}
