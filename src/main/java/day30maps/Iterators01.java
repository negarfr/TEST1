package day30maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*

    we have for-loop, while loop,do-while-loop and for-each-loop
    for-each-loop is better because is easier and its performance is better than others
    But using for-each-loop is impossible to remove or modify a collection.

    Therefor Java created a new structure to be able to remove some element from a collection or modify a collection
    the new structure calls : " ITERATOR" :1) Iterator- has one direction, from right to left. Iterator is just for removing elements
                     2) List Iterator, has two direction, form right to left and from left to right, can be use to update as well
        **** when you want to remove and update an element in collection use Iterator
        for-each-loop and Iterators have same performance but Iterators are the BEST to REMOVE or to MODIFY ELEMENT
        in collection
     */

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]

        // Example 1) Upadte every element by putting "!" to the end

        // way1- for each loop could not update the collection without using set() method
        for (String w: list1){
            w = w+"!";
        }
        System.out.println(list1);

        // 2.way -By using
        ListIterator<String> itr = list1.listIterator();
                                // Ali    Can    Aliye 
        while (itr.hasNext()){

            String el = itr.next();
            itr.set(el+ "*");
        }
        System.out.println(list1);
        while(itr.hasPrevious()){
            String el = itr.previous();
            itr.remove();
        }
        System.out.println(list1);//[]




       //  Remove all elements by using Iterator

        Iterator<String> itr1 = list1.iterator();

        while (itr1.hasNext()){
           String el = itr1.next();
           itr1.remove();
        }
        System.out.println(list1);




    }
}
