package javaquestionbank.day09loops;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {

        // Example 1: Type code to print Characters in String except "m"

        // for ep :Andromeda

        String str = "Andromeda";

        // way1 :)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'm') {
                System.out.print(ch);
            }
        }
        // way2 :)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'm') {
                continue;   // if you want to skip any value in  loop use "continue"
            }
            System.out.println(ch);
        }


        System.out.println();
        // example 2: Type code to print Characters before "m" in string
        //              for example : Luxembourg

    String city = "Luxembourg ";

        for (int i=0; i<city.length() ; i++) {

            char ch = city.charAt(i);

            if (ch == 'm') {
                break; // if you want to
            }
            System.out.print(ch);
        }

        System.out.println();

        // example 3 ; Type codes to find the sum of the unique digits in an integer
                        //for ep : 1232

        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer to see the sum of the unique digits in it");
        String num =input.next();

        int sum = 0;
        for(int i=0; i<num.length() ; i++){
            String digit = num.substring(i, i+1);
          if(num.indexOf(digit) == num.lastIndexOf(digit)){

               sum = sum + Integer.valueOf(digit);
            }

        }
        System.out.println(sum);
    }
}