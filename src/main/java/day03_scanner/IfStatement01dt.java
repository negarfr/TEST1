package day03_scanner;

public class IfStatement01dt {

    public static void main(String[] args) {

        //Example 1: Type code to print "negative" for the numbers less than Zero, non-negative numbers greater than or equal to zero.

        double d = -2.3;

        if (d < 0) {
            System.out.println("Negative");
        }
        if (d >= 0) {
            System.out.println("Non-negative");
        }

// Example 2: Type code to printe "Divisible by 5" if the number can be divided by 5, otherwise print " Not divisible by 5" if the number can not
        //Divided by 5.

        int i = 1505;
        if (i % 5 == 0) {
            System.out.println("Divisible by 5");
        }
        if(i% 5 != 0) ;
        System.out.println(" Not divisible by 5");

  // 2.way
        int k=15;
        if (k%5==0) {
            System.out.println("divisible by 5");
        }else {
            System.out.println("Non divisible by 5");
        }
    }


}
