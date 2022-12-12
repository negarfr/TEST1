package day28collections;

import java.util.*;

public class PracticeSet {

    public static void main(String[] args) {
        //Type the code that shows how many different elements there are in a list.
        //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(31);
        l1.add(15);
        l1.add(7);
        l1.add(15);
        l1.add(7);
        l1.add(7);
        System.out.println(l1);
        Set<Integer> mySet = new HashSet<>();
        System.out.println(mySet.size());

        // Type code to print different characters used in a String
            //Example: ‘Mississippi’ == > Misp

        String s = "Mississippi";
        String[] arr = s.split("");
        List<String> characters = Arrays.asList(arr);

        Set<String> mySet2 = new HashSet<>(characters);
        System.out.println(mySet2);

        // Type code to print the common elements between a Set and a List
        List<Integer>  myList=  new ArrayList<>();
        myList.add(2);
        myList.add(31);
        myList.add(15);
        myList.add(27);
        myList.add(21);

        Set<Integer> SList = new HashSet<>();
        SList.add(2);
        SList.add(25);
        SList.add(27);
        SList.add(21);
        SList.add(10);

        SList.retainAll(myList);
        System.out.println(SList);

        // type code to check if a List has repeated elements or not

        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);

        Set<Integer> mySet1 = new HashSet<>();
        mySet1.add(10);
        mySet1.add(7);
        mySet1.add(35);
        mySet1.add(13);

        mySet1.removeAll(myList1);
        System.out.println(mySet1);
    }
}
