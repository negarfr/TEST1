package day25exceptions;

public class E01 {


    /*
        1)"Exception" means un-expected issues in code execution
        2)There are two ways to work with Exceptions
            i)Using try-catch block: Handling Exception
            ii)Throw Exception and block the application
        3) If you do not handle the Exception, Java stops execution and the application is blocked.
        4) "try" can be used with a "single" or "more" catch blocks
        5) "try" "cannot" be used "alone"
     */

    public static void main(String[] args) {

        divide(6, 2);
        divide(6,3);
    }

    //1) way: but not recommend

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("A number can not be divided by zero");
        } else {
            System.out.println(a / b);
        }
    }
        // 2) way :
        // handle exception by using try-catch block

        public static void divide2(int a,int b){

            try {
                System.out.println(a/b);
                System.out.println("HI Exception");
                System.out.println("Bye Exception");
            }catch (ArithmeticException e){

                System.out.println("A problem occured in division");

        }
    }
}