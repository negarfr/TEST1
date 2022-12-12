package day01variables;

public class Variables02_John {

    public static void main(String[] args) {


        // Variables are just to store data---


        int myInt = 7;       // hey java I have a number here which i want to call it myInt and give value of 7 to it
        double shoeSize = 7.5;
        char initialName = 'A';

        System.out.println(myInt * shoeSize);  // both value like this

        String myName = "Negar";  // NON-PRIMITIVE Data

        // sometimes you can start by typing Variable's name and then call for method
        myName.length();
        myName.toUpperCase();
        // put V name and then " . " give us all methods and when we're using these methods it calls : " CALLING A METHOD "

        System.out.println(myName.length()); // to print
        System.out.println( myName.toUpperCase());
    }
}