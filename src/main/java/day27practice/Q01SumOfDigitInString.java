package day27practice;

import java.util.Scanner;

public class Q01SumOfDigitInString {
    /*
    Create a method that accepts a String as parameter and finds the sum of digits in that String.
    Example:
    input : J4\/4 1$ 34$¥
    output : 16
    Hint:
    Character.isDigit()
    Integer.valueOf()
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();

        sumOfDigits(str);

    }
    public static void sumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                sum += Integer.valueOf(""+ str.charAt(i));
            }

        }
        System.out.println("sum of digits" + sum);
    }
}

