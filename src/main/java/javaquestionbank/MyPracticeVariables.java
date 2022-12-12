package javaquestionbank;

import java.util.Scanner;

public class MyPracticeVariables {

    public static void main(String[] args) {

        // q.1 :Create double variables for the prices of any 3 items. Print the sum of the prices on the
        // console with a label.

        double shoePrice = 25.99;
        double skirtPrice = 11.99;
        double shirtPrice = 19.99;
        System.out.println("total price" + (shirtPrice+skirtPrice+shoePrice));

        //Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        //multiplication of the values on the console with a label.

        float penPrice = 3.15f;
        long  printerPrice = 200l;
        int   paperPrice = 5;
        System.out.println( "Multiplication" + penPrice*printerPrice*paperPrice);

        //Type a code to find simple interest.
        //Note:Simple interest formula = principal * rate * numberOfYear / 100

        int p= 2000;
        int r= 2;
        int numOfYear=7;
        int simpleInterest = p*r*numOfYear/100;
        System.out.println("The simple interest is " + "simpleInterest");

    // Create a String and two Long variables. Print the sum and the multiplication of the long
        //variables with the String on the console.
    String s = "The result is";
    long a= 123l;
    long b= 22l;

        System.out.println("The result is" +(a+b));
        System.out.println(s+(a*b));

        //5. Create two boolean variables whose values are different and print their values in the same
        //line with a space between two consecutive values


        boolean m =true;
        boolean n =false;
        System.out.println(m+""+n);

        //Create 3 float variables for the price of a book, notebook, and laptop.
        //Print the total price of 2 books, 4 notebooks and 3 laptops on the console

    float priceOfBook = 12.99f, noteBook= 23.45f,laptop=250f;
    float totalPrice = 2* priceOfBook + 4*noteBook + 3*laptop;
        System.out.println("totalPrice is" + totalPrice);

        //T
        // ype a code to swap two integers.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
    }
}

