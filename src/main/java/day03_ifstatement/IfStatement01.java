package day03_ifstatement;

import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.Locale;
import java.util.Scanner;

public class IfStatement01 {
    /*
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use " if " to specify a block of code to be executed, if a specified condition is true
Use " else "to specify a block of code to be executed, if the same condition is false
Use "else if" to specify a new condition to test, if the first condition is false
Use "switch" to specify many alternative blocks of code to be executed
     */

    public static void main(String[] args) {

        int i = 38;

        if (i % 5 == 0) {

            System.out.println("Divisible by 5");
        }
        if (i % 5 != 0) {
            System.out.println("Not divisible by 5");
        }
        int k = 18;
        if (k % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
        // 1) Type code to print
        // a) "Winter" for December, January, February
        // b) "Spring" for March, April, May
        // c) "Summer" for June, July, August
        // d) "Fall" for September, October, November
        // e) "Invalid month name" for all the others

        String mName = "December";
        mName = mName.toLowerCase();
        if (mName.equals("december") | mName.equals("january") || mName.equals("february")) {
            System.out.println("Winter");
        } else if (mName.equals("march") || mName.equals("april") || mName.equals("may")) {
            System.out.println("Spring");
        } else if (mName.equals("june") || mName.equals("july") || mName.equals("august")) {
            System.out.println("Summer");

        } else if (mName.equals("september") || mName.equals("october") || mName.equals("november")) {
            System.out.println("FaLL");
        } else {
            System.out.println("Invalid month name");
        }

        //2) Type code to print
        // a) "Valid Password" if the password has at least 8 characters different from space character
        // b) "Do not use space character in password" if the password has any space character in any position
        // c) "Invalid Password" if a and b conditions are not satisfied
        String password = "abc#3w8c";
        if (password.replaceAll("\\S", "").length() > 0) {
            System.out.println("Do not use space character in password");
        } else if (password.replaceAll("\\s", "").length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        // ===>>>   replaceAll \\s  ====>
        //String.replaceAll() takes a regex as first parameter and the replacement text for all matches
        // of that regex as second parameter.
        // Here, you have given \\S as the first parameter, which matches every non-whitespace character.
        // The replacement string given is a whitespace. So the returned String would be having whitespaces only.
//--------------------------------------------------------------------------------------------------------------
        // 3) Ask user to enter an integer, then print "Positive" on the console if the number is positive
        // print "Negative" on the console if the number is negative
        // print "Neuter" on the console if the number is zero

        Scanner inputScan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int anInt = inputScan.nextInt();

        if (anInt > 0) {
            System.out.println("Positive");
        } else if (anInt < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Neuter");
            ;
        }
//-------------------------------------------------------------------------------------------------------------------
        //4Ask user to enter a day name then
        //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        //print "Weekend Day" for Saturday and Sunday
        Scanner input = new Scanner(System.in);
        System.out.println("enter day name");

        String dayName = input.next();

        if (dayName.equals("Monday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");

        }if (dayName.equals("Sunday")) {
            System.out.println("weekend");
        }
    }
    }





