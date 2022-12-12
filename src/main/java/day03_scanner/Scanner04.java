package day03_scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        // Example 1: Get first, middle.last name and SSN from the user and then print them like given format
        // Tom Jim Hanks
        // 235698741

        Scanner input= new Scanner( System.in);

        // Getting the first name
        System.out.println("enter your first name");
        String firstName= input.next();

        //Getting the middleName
        System.out.println(" Enter your middle name");
        String middleName= input.next();

        // //Getting the lastName
        System.out.println("Enter your last name");
        String lastName= input.next();

        //Getting SSN
        System.out.println("Enter your SSN");
        String ssn=input.next();

        System.out.println(firstName + ""+ middleName+""+lastName);
        System.out.println(ssn);
    }
}
