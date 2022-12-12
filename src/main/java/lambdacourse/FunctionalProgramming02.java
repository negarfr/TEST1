package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;                          /*
                                                Functional programing can be done in two ways :
                                                   way 1- Lambda Expression
                                                   way 2- Method Reference-Method Ref is preferable to use
                                                */
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
    /*
    METHOD REFERENCE : Class Name :: Method Name without Method parenthesis
    Example ==>         String    :: length
                        ArrayList :: size
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElementFunctional(l);
        printEvenElementsStructured(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOfElements(l);
        sumOfSquareOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);
        System.out.println();
        getMaxElement(l);
        getMinElement01(l);
        System.out.println();
        getMinGreaterThanSevenEvenNum01(l);
        System.out.println();
        getHalfOfDistinctElementInReverseOrder(l);

    }

    // create a method to print the elements on the console in the same line with a space between two executive elements
    //( Method Reference )
    public static void printElementFunctional(List<Integer> list) {
        //(t->System.out.print(t+" ")); instead of this code we use Method Reference, we create in "UtilsClass" boro onja
        list.stream().
                forEach(UtilsClass::printInTheSameLineWithASpace); //syntax of Method Reference

        // If java has any "Method" we prefer to use it, If Java doesn't have it we create Method inside the UtilsClass and use it //
    }

    //===========================================================================================================================>
    /* TASK 2 ) Create a method to print the even elements in the list on the console in the same line with a space
     between two consecutive ele.s (Functional with method reference)
    */
    // this Task in previous class we solved it with Functional Programming but in this class for those parts inside Filter()
    // we create method without parenthesis in UtilsClass and use it here and forEach() as well
    public static void printEvenElementsStructured(List<Integer> list) {
        list.
                stream().
                filter(UtilsClass::checkToBeEven).forEach(UtilsClass::printInTheSameLineWithASpace);
    }

    //==========================================================================================================================>
    // 3) Create a method to print the square of odd list elements on the console in the same line with a space between
    // two consecutive elements (Functional P explained to Method reference )
    public static void printSquareOfOddElements(List<Integer> list) {
        // list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.println(t+ " "));
        //(t-> t%2!=0) and (t-> t*t) and t-> System.out.println(t+ " ") will change to METHOD REFERENCE
        // which means we have to create Methods for them in UtilsClass
        list.
                stream().
                filter(UtilsClass::checkToBeOdd).
                map(UtilsClass::getSquare).
                forEach(UtilsClass::printInTheSameLineWithASpace);
    }
//===================================================================================================================================>

    //4) Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.(Functional Method Reference)

    public static void printCubeOfDistinctOfElements(List<Integer> list) {

        list.stream().
                distinct().filter(UtilsClass::checkToBeOdd).
                map(UtilsClass::getCube).
                forEach(UtilsClass::printInTheSameLineWithASpace);
    }
//==========================================================================================================================================>

    // TASK 5)Create a method to calculate the sum of the square of distinct even elements
    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list) {

        Integer sum = list.stream().distinct().
                filter(UtilsClass::checkToBeEven).
                map(UtilsClass::getSquare).
                reduce(0, Math::addExact);// Java Has Addition operation in Math class so no need to create in UtilsClass
        System.out.println("The Sum of the squares of even distinct elements is " + sum);
    }
//======================================================================================================================================>

    // TASK-6) Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {

        Integer product = list.stream().distinct().
                filter(UtilsClass::checkToBeEven).
                map(UtilsClass::getCube).
                reduce(1, Math::multiplyExact);

        System.out.println("the cubes of distinct even elements" + product);
    }
    //========================================================================================================================================>
    // TASK- 7) create a method to find the Maximum value from the list elements
    public static void getMaxElement(List<Integer> list) {

        Integer MaxEl = list.
                stream().
                reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("The min element is" + MaxEl);
    }

    //=============================================================================================================>
    // TASK- 8) create a method to find the Min-Value from the list element ( in 2 ways )
    public static void getMinElement01(List<Integer> list) {

        Integer minEl = list.
                stream().
                reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("The min element is " + minEl);
    }

    //==================================================================================================================>
// TASK-9) Create a method to find the minimum value which is greater than 7 and even elements from the list
    public static void getMinGreaterThanSevenEvenNum01(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t > 7).filter(UtilsClass::checkToBeEven).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);

        System.out.println("the min element is " + min);
    }

    //=====================================================================================================================>
// 10) Create a method to find the hal of the elements which distinct and greater than 5 in reverse order in list
    public static void getHalfOfDistinctElementInReverseOrder(List<Integer> list) {
        List<Double> result = list.
                stream().
                distinct().
                filter(t -> t > 5).
                map(UtilsClass::getHalf). // we create a method for this in Util class
                        sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("half of the element is " + result);
    }
}