package day01variables;

public class Variables {

    public static void main(String[] args) {

        // VARIABLES ARE *CONTAINERS* FOR STORING DATA VALUES
    // **** To create a variable, you must specify the type and assign it a value:

 // First we need to declare the variable, To do that all we need is "DATA Type" and Variable Name

        String name;
        boolean isSheStudent;
        int score;
        double average;
        byte nextInStream;
        short hour;
        long totalNumberOfStars;
        float reactionTime;
        double itemPrice;

    // Initializing Variables-this means we need to assign Value to Variable

       name = "Arcilla";
       isSheStudent = true;
        score = 100;
        average = 95.50;

     // Creating Integer variable with name of Age :

        //declare the variable and give it a value all in one statement

        int age = 6;

        // I am creating a char variable whose name is firstNameInitial

     char firstNameInitial = 'A';

     // Print Value of above
        System.out.println(age);
        System.out.println(firstNameInitial);

        // create 3 integer variables, assign values to them, print them on the console one by one
        // a) Print them on the console
        // b) Print the sum of the console one by one
        // c) Print the sum of the 3 integers by a label at the beginning. Example: 'The sum is 39'

        int i01 = 15, i02 = 9, i03 = 6;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);

        System.out.println("The sum is " +(i01+i02+i03));

        // We need concatenation operation to add string and integer.
        System.out.println("The sum is: "+ i01 + i02 + i03); // "The sum is: "+121314
        System.out.println("The sum is: "+( i01 + i02 + i03));

        int sum = i01+i02+i03;
        System.out.println("The sum is " + sum); // This is better than previous one.

        //Create 2 integer variables and print their multiplication on the console with a label

        int x = 5, y =3;

        System.out.println("The multiplication is : " + (x*y));
        System.out.println("The multiplication is : " + x*y);

        /*
            Order of Operations in Math
            1) Do the operations inside the parenthesis first
            2) Do multiplication and division
            3) Do addition and subtraction
        */

        String a = "water";
        String b = "Kool-aid";
        String temp = "null";

        System.out.println( a+ " " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
