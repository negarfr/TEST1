package day03_scanner;

import java.util.Scanner;

public class IfStatement02dt {
    public static void main(String[] args) {


/*

Example 1: Type code to print "Weekday" for the weekday names, "Weekend day" for the weekend days
Monday - Friday ==> Weekday            Saturday, Sunday ==>Weekend day

 */
//1.Step:
        Scanner input = new Scanner(System.in);

//2.Step:
        System.out.println("Enter the day name");

//3.Step: Create appripriate container/variable to put the data (==) to check equality of the numbers==>primitive data types
//Note: To compare Strings use "equals()"
        String dayName= input.next();
//1.way:

        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend day");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend day");
        }

//2.way: if else statement ==> with or => || ==> this sign means "OR" operator in Java

        if(dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday") || dayName.equals("Thursday") || dayName.equals("Friday")){
            System.out.println("Weekday");
        }else {
            System.out.println("Weekend day");
        }
    }

}



