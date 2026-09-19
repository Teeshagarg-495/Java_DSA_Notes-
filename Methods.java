public class Methods {
    public static void main(String args[]){

        System.out.println("Table of 2 :");
        printTableof2();
        System.out.println("Khatam !");

    }


    // method declaration and definition
    static void printTableof2(){
        for (int i = 0 ; i <=10 ; i++){
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }
}
