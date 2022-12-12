package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class list01 {

    public static void main(String[] args) {
        //Example 1- type code to make all elements in list unique
        // [2,3,2,2,5] ==>[2,3,5]
        List<Integer> a= new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer> b= new ArrayList<>();

        for (Integer w: a){
            if (!b.contains(w)){
                b.add(w);
            }
        }
        System.out.println(b);
    //2). Ask user to enter a letter, if the letter exists inside the list covert the element
        // "Got it", otherwise add the element into the list
        //           [A, K, R, S] ==> User --> K ==> [A, Got it, R, S]
        //           [A, K, R, S] ==> User --> P ==> [A, K, R, S, P]
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Letter....");
        String str = input.nextLine();

        List<String> c= new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        if (c.contains(str)){
            c.set(c.indexOf(str),"Got it");
            }else {
            c.add(str);
        }
        System.out.println(str);
        //
        List<String> d= new ArrayList<>();
        d.add("Ab");
        d.add("Kl");
        d.add("Rs");
        d.add("St");
        d.add("Rs");

        int e= d.indexOf("Rs");
        System.out.println(e);

        int f= d.indexOf("Xy");
        System.out.println(f);
    //Note: How can you understand the existence of a specific element in a List?
    //      i) Use indexOf() method if the result is "-1" it means the element does not exist,
    //      if the result is not "-1" it means the element exists
    //      ii) Use contains()
       int g=  d.lastIndexOf("Rs");
        System.out.println(g);

    }
}
