package day10loops;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while loop
        // when you use while-loop zero execution is possible
        int i = 1;
        while (i < 1) {
            System.out.println("while loop");
            i++;
        }
        // do-while loop
        int k = 1;
        do {
            System.out.println("do-while loop");
            k++;
        } while (k < 1);

          /*
              Example 1: Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
        */
        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Enter a number to play");
            num = input.nextInt();
            if (num < 100) {
                System.out.println("Won");
            }
        } while (num < 100);
        System.out.println("LOST");



      //  Ask user to enter a name.If the name contains the letter ‘a’ then print "Won!" on the console
        //otherwise ask user to enter another name.Use do-while loop.
        Scanner input1 = new Scanner(System.in);
       String str = " ";
        do {
            System.out.println("Enter a name");
          str = input1.nextLine();
            if (str.contains("a")) {
                System.out.println("won");
            }

        } while (!str.contains("a"));
        System.out.println("another name");
    }
}



