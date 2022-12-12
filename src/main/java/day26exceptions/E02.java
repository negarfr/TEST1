package day26exceptions;

public class E02 {

    /*
   1) if you want to execute the code for every scenario, use "finally" block after "try" body
    2)"try" can be used like i) try + single catch  ii)try + multiple catch  ii)try + single catch + finally
                             iv)try + multiple catch + finally   v)try + finally
                             Note: "try" cannot be used alone

     */
    public static void main(String[] args) {
    divide(6,0);

    }

// create a method to do division then save the result into Database

    public static void divide( int a, int b){

        try {
            System.out.println(a / b + "was saved into database");
        }catch (ArithmeticException e){
            System.out.println("do not use zero as divisor");
        }finally {
            System.out.println("cut the connection with the database");
        }

    }

}
