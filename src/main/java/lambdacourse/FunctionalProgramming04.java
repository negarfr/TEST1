package lambdacourse;

import lambdacourse.UtilsClass;

import java.util.stream.IntStream;

public class FunctionalProgramming04 {


    public static void main(String[] args) {
        System.out.println(getSumFromSevenToHundred01()); // run the code and put empty parentheses inside the sout
        System.out.println(getSumFromSevenToHundred02());
        System.out.println(getMultiplicationFromTwoToEleven());
        System.out.println(calculateFactorial01(-6));// need to give number here because inside it should not give negative
        // that is why we put if () for negative numbers
        System.out.println(calculateFactorial02(5));
        // 120 with putting conditions even if system receives Negative number,second condition works
        System.out.println(sumOfIntsInGivenRange(2, 4));// 6
        System.out.println(findSumOfDigitsInGivenRange(23, 32));
    }

    // Task 01- create a method to find the sum of integers from 7 to 100
    public static int getSumFromSevenToHundred01() {

        return IntStream.range(7, 101).reduce(0, Math::addExact);

        // in Functional Programming there is IntStream which give us directly integer stream,
        // and method rang() give value to IntStream
    }

    public static int getSumFromSevenToHundred02() {

        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }
//======================================================================================================================>
    // Task 2- Create a method to find the multiplication of the Integers from 2 (included) to 11 (inc)

    // we use the range closed method because they are included
    public static int getMultiplicationFromTwoToEleven() {

        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
        // we already have method in Java when we type :: so use that
    }

    // Task 3- Create a method to calculate the factorial of given number. for ex : 5 factorial =1*2*3*4*5 ==> 5! = 1*2*3*4*5

    // way 01
    public static int calculateFactorial01(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);// go to Math class and use multiplyExact method
            // we tell java to put our new data which starts from 1 to receive result for Multiplication
            // multiplyExact this is actually ==>   int sum = 1
            //                                      sum = sum * multiplication
        }
        System.out.println("Do not use negative numbers in calculateFactorial");
        return 0;
    }

    // way-02
    public static Object calculateFactorial02(int x) { // coz Object data type returns Int and String so we change to this Data type

        return x > 0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers in calculateFactorial";
    }
    // Task 4- Create a method to calculate the sum of even Integers between given two integers

    public static int sumOfIntsInGivenRange(int a, int b) { // telling java use int a and int b
        // if we put the bellow condition even if we get minus ( negative ) numbers still we get the result instead of Zero on console
        // in other words to save our code from any "Exceptions" we put conditions as bellow
        int x = 0; // temporary container
        if (a > b) { // if first number is greater than second number
            x = a; // assigned the value of a into the x
            a = b; //  assigned the value of b into the a
            b = x; // assigned the value of x into b
        }
            return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).sum();
            // Task asking to receive even integers,we do not method in Java, so we use filter and go to UtilClass

        }
    // Task 5- Create a method to calculate the sum of Digits of every integers between given two integers
            // 23 and 32 ==> 2+3  2+4  2+5  2+6  2+7  2+8  2+9 3+0  3+1 3+2 ==> for each sum part we will use sum of digits
    // %10 in Java === so we create getSumOfDigits method In UtilClass

    public static int findSumOfDigitsInGivenRange (int a , int b){

       return IntStream.rangeClosed(a,b).map(UtilsClass::getSumOfDigits).sum();

    }


    }
