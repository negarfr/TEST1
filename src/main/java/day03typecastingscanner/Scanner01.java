package day03typecastingscanner;

import java.util.Scanner;

public class Scanner01 {

     /*
    Scanner class is used to get the data fromm user into our codes.

    How do we get the data from the user?
    1.Step: Create an object from "Scanner Class".

    Class Name     Object Name    Assignment Operator    new Keyword     Constructor==>Class Name +()
     Scanner        input             =                    new               Scanner(System.in);
                    scan                                               //Cons- is special method used to
                                                                       //initialize the method.
     2.Step: Give a message to user about the data you ask
     */
    public static void main(String[] args) {

       Scanner input =new Scanner(System.in);  // will get data from user

        System.out.println("Enter your age");

        int age =input.nextInt(); // To get int data from user use nextInt() method

        System.out.println(age);

        System.out.println("Enter your name");

        String name = input.next();
        System.out.println(name);

        System.out.println("Enter your address");

       String Address = input.nextLine(); // To get String data from user use nextLine() method

        System.out.println(Address);


    }
}
