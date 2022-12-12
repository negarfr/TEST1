package day03typecastingscanner;

public class TypeCasting01 {

    public static void main(String[] args) {

        // example 01'  create two integer variable and one string variable

        int i =13;
        int k =21;

        String s= "Tome";

        System.out.println(i + k+ s);

    //
        /*
           Order of the operations in Math
           1)Calculate the exponantial
           2)Do the operations inside the parenthesis
           3)Do multiplications and divisions
           4)Do add and subtractions
         */

        int result = 3-2 * (5+2*3)/11;

        System.out.println(result);

        // Type Casting
        int n =15;
        byte b= (byte)n;

    }
}

