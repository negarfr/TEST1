package day03_scanner;


import java.util.Scanner;


public class Scanner02dt {   //Scanner class is to use to get user input

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in); // 1- to use Scanner class wew need to create an "object" pf the class

     System.out.println("Enter the width");// 2- tell to system what to do

     double width= input.nextDouble(); // 3- and then use any available methods found in Scanner class documentation
                                        // in here we use nextDouble() to enter the with which is 8.25
   System.out.println("Enter the length");
   double length= input.nextDouble();

   System.out.println("The area of the rectangular is: "+width * length);

    }
}
