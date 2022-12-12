package lambdacourse;

import lambdacourse.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgramming03 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Tom");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Merry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben"); // we can change elements so list are mutable

////////////////// calling all methods for the tasks bellow
        printInUpperCase01(l);
        System.out.println();
        printInUpperCase02(l);
        System.out.println();
        printElementSortedByLength(l);
        System.out.println();
        printElementSortedByLengthInReverseOrder(l);
        System.out.println();
        printDistinctElementSortedByLastChar(l);
        System.out.println();
        printElementSortedByLengthThenSortByInitials(l);
        System.out.println();
        RemoveElementIfLengthGreaterThanFive(l);
        System.out.println();
        RemoveElementIfStartsWithAAndEndWithO01(l);
        System.out.println();
        RemoveElementIfStartsWithAAndEndWithO02(l);
        RemoveIfLengthIsBetweenFiveAndTenOrEndingWithO(l);
        System.out.println(checkLengthAreLessThanTwelev(l)); // true
        System.out.println(checkAnyNotToStartWithX(l));
        System.out.println(checkAnyEleEndingtWithR(l));


    }

   //1- create a method to create all lists elements in "UpperCase",
    public static void printInUpperCase01 (List<String> list){
        // 1.way
     list.
         stream().
           map(String::toUpperCase).//we are updating the elements to Uppercase,we use map().there is method in java to update
                                    // this is in String Class and Uppercase method is already in Java,we use it doesn't need to create
                forEach(UtilsClass::printInTheSameLineWithASpace);//Task ask us to print

        // ***** if there is method we can use direct in java do not have to create it.
        // use stream() look down
    }
    //WAY-2 )
    public static void printInUpperCase02 (List<String>list){
        list.replaceAll(String::toUpperCase); //Sometimes we can do Functional Programming  without Stream()
        System.out.println(list);
        // to replace all the characters to uppercase-this is the shorter way we do not HAVE TO use always STREAM()
    }
//======================================================================================================================>
    // example 2- Create a method to print the elements after ordering according to their Lengths

    public static void printElementSortedByLength (List<String>list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithASpace);
    // when we use Sorted() we will have an alphabetical order in String and in this task is asking to print them
    // according to their "Length"
    }
    // example 3- Create a Method to print an element after ordering according to their lengths ( In reverse order )

    public static void printElementSortedByLengthInReverseOrder(List<String>list){

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printInTheSameLineWithASpace);
        // to be able to reach to sorted method coz there is no direct method to reach that
        // with sorted() we're telling Java sort all elements by Comparing their Length, but we have to use reverse to print them
        // if we do not have the ready method can create a method in a class that we created, check the UtilClass data
        // we already created a " printInTheSameLineWithASpace " there. so we use for each to get all one by one with same method
        // in Util-calls we created our usefull methods there and whenever we want can go there and use them.
    }
    // Example 3- Create a method to sort the "distinct" elements by using their last characters

    public static void printDistinctElementSortedByLastChar(List<String>list){

        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).
                forEach(UtilsClass::printInTheSameLineWithASpace);

        ///****** // because we do not have get last character we create one in UtilClass ///*****///
    }
 // Example 4 - Create a method to sort the element according to their length then according to their first character

    public static void printElementSortedByLengthThenSortByInitials(List<String>list){
        list.
        stream().
        sorted(Comparator.comparing(String::length).thenComparing(t-> t.charAt(0))).
        forEach(UtilsClass::printInTheSameLineWithASpace);

    }
//  // Example 6- Remove the element if the Length of the element is greater than 5
    public static void RemoveElementIfLengthGreaterThanFive (List<String>list){

        list.removeIf(t-> t.length()>5);  // this is a "Specific situation" so we have to type it manually
        System.out.println(list);
   // the one we typed inside the parametrises means :
   // remove if the element has a length greater than 5, we did not use stream() because when we looked there was the removeIf()
  }

//    // Example 7- Remove the element if starting with 'A' , 'a' or ending with 'O' or 'o'
//         way 1)
    public static void RemoveElementIfStartsWithAAndEndWithO01 (List<String>list){

   Predicate<String> checkCondition =t-> t.charAt(0)=='A'|| t.charAt(0)=='a'|| t.charAt(t.length()-1)=='O'|| t.charAt(t.length()-1)=='o';

        list.removeIf(checkCondition);

        System.out.println(list);
  }
    public static void RemoveElementIfStartsWithAAndEndWithO02(List<String>list){
        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("O") || t.endsWith("0"));
      // remove if   first Character == 'A' OR first Charac =='a' OR last Character == 'O'   or last char == 'o'
        System.out.println(list);
    }
    // Example 8- Remove the element if the element length is between 5 and 10 or ending with 'o'
    public static void RemoveIfLengthIsBetweenFiveAndTenOrEndingWithO (List<String>list){

        Predicate<String> checkCondition = t-> (t.length()>4) && t.length()<11|| t.endsWith("O");
        list.removeIf(t -> checkCondition.test(t) );
        System.out.println(list);
        // when we want to make code more readable and check all condition, we have "Test" in Predicate
        // Predicate ==> are an interface and helps us to check the conditions are applied or not
   }
     // Example 9- Create a method to check if we lenght of all element are less than 12

    public static boolean checkLengthAreLessThanTwelev(List<String> list){

               return  list.stream().allMatch(t-> t.length()<12);
        // use allMatch() to check
    }
    // Example 10 - Create a method to check if the initial of any element is not 'X'

    public static boolean checkAnyNotToStartWithX(List<String> list){

       return list.stream().noneMatch(t-> t.startsWith("X"));

    }
    // Example 10- Create a method to check if at least one of the elements ending with "r"
    public static boolean checkAnyEleEndingtWithR(List<String> list){

       return list.stream().allMatch(t-> t.endsWith("r"));
    }
}
