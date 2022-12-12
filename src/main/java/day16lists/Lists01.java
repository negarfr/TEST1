package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //How to create a list (ArrayList)
        //1.
        ArrayList <Integer> myList1 = new ArrayList<Integer>();
        //2.
        ArrayList<Integer> myList2= new ArrayList<>();
        //3.
        List<Integer> myList3 = new ArrayList<>();

        System.out.println(myList3);
        // how to add elements
        // Note : add ()

        myList3.add(12);
        myList3.add(7);
        myList3.add(23);

        myList3.add(1,50);

        myList3.add(2,99);
        System.out.println(myList3);
        List<String>  a= new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b= new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);

        a.addAll(1,b);
        System.out.println(a);

        //How to get the number of elements in a List
        int sizeOfA = a.size();
        System.out.println(sizeOfA);// 8

        int sizeOfB = b.size();
        System.out.println(sizeOfB);// 3

        //Note: When you talk about the number of the elements in an Array use "length of the array", for the lists use "size of the list"

        // 1. type code tp check if the given list is empty or not ?

        List<Character> c = new ArrayList<>();
        c.add('x');
        c.add('y');
            //1.way
        int sizeOfC= c.size();

        if (sizeOfC==0) {
            System.out.println("The List is empty");
        }else {
            System.out.println("The list is not empty");
        }

            // second WAY :JAVA create the method to check if a list is empty or not
            //  isEmpty() method returns "TRUE" if the list does not have any element

        boolean isEmpty = c.isEmpty();

        if (isEmpty){
            System.out.println("The List is empty");
        }else {
            System.out.println("The list is not empty");
        }

        // If Java has
        // example 2. Type code to check if the list doest not have any element different from space or list
        // does not have any element
        // [] ==> is acceptable   [ , , ] ==> Acceptable    [a] ==> Not Acceptable

        List<String> d = new ArrayList<>();
        d.add(" ");
        d.add(" ");
        d.add(" ");
        d.add("a");
        System.out.println(d);

        // to be able to use removeAll () you need List, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
        e.add(" ");
       d.removeAll(e);
        System.out.println(d);

        if (d.isEmpty()) {
            System.out.println("The list is empty or has just space character");
        }else {
            System.out.println("The list is has characters different from space");
        }

    }
}
