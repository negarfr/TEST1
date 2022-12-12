package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
                /*
1) LAMBDA IS FUNCTIONAL PROGRAMMING- in Programming Languages they use Functions. but in Java we use function as method
so in Java In Lambda we only use " METHOD ".
in Functional Programming there will not be any creating Methods, we use just EXISTING METHODS
2) FUNCTIONAL PROGRAMMING was added to Java In Java 8, before we were using just Structured Programming.
After Java 8 we are able to use both.

3) Structured Programming focuses on " HOW TO DO" most of the time
but in FUNCTIONAL PROGRAMMING focuses on " WHAT TO DO "
4) FUNCTIONAL PROGRAMMING is used with " Collections" ( list or set ) and "Arrays"
5) By using " entrySet() " method java converts Map to Set then you can use Functional Programing in Maps as well.

functional programming is called lambda . To type codes in functional programming is shorter, and it is error free.
In functional programming, we use the methods that were created by Java.
The usage of structured programing is a longer way to type codes in Java.
For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
thousands of times before it was deployed.
Functional programming can be used for arrays, collections and maps, we cannot use maps directly in functional programming.
At the beginning we should convert a map to a collection,
and then we can use maps for functional programming as well ==>How to convert a map into a collection??
*/
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();    // ALWAYS remember List works with non-primitive data type

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);


        printElement(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOfElements(l);
        System.out.println();
        sumOfSquareOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);
        System.out.println();
        getMaxElement(l);
        System.out.println();

        System.out.println();
        getMinElement01(l);
        System.out.println();
        getMinElement02(l);
        System.out.println();

        System.out.println();
        getHalfOfDistinctElementInReverseOrder(l);

    }
    // TASK -1 create a method to print the elements on the console in the same line with a space between two executive elements
    //(Structured programming)
    public static void printElement(List<Integer> l ) { // "static" because we call method from the main method which is Static as well
                                // our main use list to print that is why we put list inside parameter

        for (Integer w : l) {
            System.out.println(w + " ");
        }
    }
    // now we use "Functional Programming "
public static void printElementsFunctional(List<Integer> l){
        l.stream().forEach(t->System.out.print(t+" "));

    // Stream() method gives us flexibility of using all data and elements
    // forEach() is getting first element putting into "t" and then by System.println we tell java to print the new value of "t"
    }
 //=====================================================================================================================

    // TASK-2 ) Create a method to print the even elements in the list on the console in the same line with a space
    // between two consecutive ele.s ( Structured P )

    public static void printElementsStructured(List<Integer> list){

        for (Integer w : list ) {
                if (w % 2 == 0) {
                    System.out.print(w + " ");
                }
            }
        }
        // now we do the same with "Functional Programming "
        public static void printEvenElementsFunctional(List<Integer> list){

        list.stream().filter(t-> t%2==0).forEach(t -> System.out.print(t+" "));

                    /// we want to print only "even" numbers so we "FILTER() and in Filter() we sue the conditions ///
                    ///t-> t%2==0 the name of that structure is called " Lambda Expression"///
                    /// After filter the numbers we can use forEach() to print it ///
        }
//=====================================================================================================================
// TASK - 3) create a method to print the square of odd list elements on the console in the same line with space between
// two consecutive elements (Functional P )
    public static void printSquareOfOddElements(List<Integer> list){

        list.stream().filter(t-> t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+ " "));

                                /// map() is to change value of elements ///
    }
//=====================================================================================================================
    // TASK- 4) create the method to print the cube of distinct odd list elements on the console in the same line
    // with space  between two consecutive elements
    public static void printCubeOfDistinctOfElements(List<Integer> list){

        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));

                              /// distinct () REMOVES the repeated elements ///
    }
//=====================================================================================================================
    // TASK 5- ) Create a method to calculate the sum of the square of distinct even elements
    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list) {

        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
        // TOZIHAT MOHEM :  distinct()==>we use this because it says  in the task
        //                   filter()==> we use this because it says "even" elements
        //                   map()  ==> we use this because it wants the "square " to change the value of elements
        //                   reduce() ==>we use this because it does ask for "sum ", instead of Sum there is "reduce" method

        // we put all inside sum Integer container
    }
//=====================================================================================================================>
    // TASK-6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements (List<Integer> list){
       Integer product =  list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t,u)-> t*u);
                                                            //inside REDUCE() we put 1 as first value coz is Multipl
        System.out.println(product);
    }
//=====================================================================================================================>
    // TASK- 7) create a method to find the Maximum value from the list elements
    public static void getMaxElement(List<Integer> list){

        Integer MaxEl = list.stream().reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t:u);
                // no need to use distinct() and filter() because we use all elements.
        // only reduce() because from all elements we're going to receive one element that is why we use reduce()
  // reduce(Integer.MIN_VALUE, (t,u)-> t>u ? t:u) ==> first min value of Integer is t=-214783648 u =8 so Max value = 8 will be selected
        // second check ==> t = 8 and u = 9 Max value = 9 which will be selected

        System.out.println("The Max element is " + MaxEl );
    }
    // WAY-2 )
    public static void getMaxElement01(List<Integer> list){
        //1.way:

        Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);
        System.out.println(max);
    }
//======================================================================================================================>

 // TASK- 8) create a method to find the Min-Value from the list element ( in 2 ways )
    public static void getMinElement01(List<Integer> list) {

        Integer minEl = list.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("The min element is " + minEl);
    }
        // Way 2 )
    public static void getMinElement02(List<Integer>list){

        Integer min = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)-> u);
        System.out.println(min);
    }
//====================================================================================================================>
    // TASK-9) Create a method to find the minimum value which is greater than 7 and even elements from the list
    public static void getMinGreaterThanSevenEvenNum01(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t > 7 && t % 2 == 0).reduce(Integer.MAX_VALUE, (t, u) -> t<u ? t:u);

        System.out.println(min);
    }
        public static void getMinGreaterThanSevenEvenNum02(List<Integer> list){

       Integer minEl=  list.stream().distinct().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst().get();

        // findFirst() gives first element from stream and to use with get() we get the Integer value
    }
//=====================================================================================================================>
    // 10) Create a method to find the hal of the elements which distinct and greater than 5 in reverse order in list
    public static void getHalfOfDistinctElementInReverseOrder (List<Integer> list){
       List<Double> result = list.
               stream().
               distinct().
               filter(t-> t>5).
               map(t-> t/2.0). // half of the element means we need to change Vlau so use "map()",inside map use Lambda Expression
               sorted(Comparator.reverseOrder()).// this method put all elements into "reverse order"
               collect(Collectors.toList());//task asking the result in a list : I should collect all elements in a List
        System.out.println(result); // [65.5, 5.0, 4.5, 4.0]
    }
    //=== > because task ask us to put in reverse order and in Comparator class we have reverse order and use sorted method
  }
//======================================================================================================================>

            //collect(Collectors.toList()) ===> to CONVERT String elements to a LIST








