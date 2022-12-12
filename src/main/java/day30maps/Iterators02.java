package day30maps;

import java.util.*;

public class Iterators02 {

    public static void main(String[] args) {

        // Ex1- Increase the numebrs in list by 20% and print the element in the reverse order of the given order
            // [20, 60,30,100] ==> increase 20% ==> [24, 72, 36, 120] ==> [120, 36, 72, 24]

        List<Integer> list1 = new ArrayList<>();
        list1.add(20);
        list1.add(60);
        list1.add(30);
        list1.add(100);
        ListIterator<Integer> itr= list1.listIterator();

        // this code moves the POinter to the end
        while (itr.hasNext()){
            itr.next();
        }
        // even by doing update from right to left order of list element does not change
        // If you want to change the order of the element use Collection.reverse(list1)
        while (itr.hasPrevious()){
           Integer el =  itr.previous();

           itr.set(el*120/100);
        }
        Collections.reverse(list1);
        System.out.println(list1);
    }
}
