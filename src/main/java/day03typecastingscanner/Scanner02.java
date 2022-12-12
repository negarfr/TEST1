package day03typecastingscanner;

import java.util.Scanner;

public class Scanner02 {

    // Example : Get the width and the length of a rectangle from user and calculate the area of the rectangle
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width");
       Double width = input.nextDouble();

        System.out.println("Enter the length");
        Double length = input.nextDouble();

        System.out.println(width*length);
    }

}
