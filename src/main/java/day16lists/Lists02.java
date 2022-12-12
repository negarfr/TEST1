package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: Type code to remove the first occurrence of a specific element from a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]
            // TO REMOVE first occurence Java create method calls "remove()"

        List<String> a = new ArrayList<>();
        a.add("shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("shoes");
        a.add("book");
        a.add("shoes");
        System.out.println(a);
        a.remove("shoes");

        System.out.println(a);


        //Example 1: Type code to remove all occurrence of a specific element from a String list
        //           ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"]

        List<String> b = new ArrayList<>();
        b.add("shoes");
        b.add("TV");
        b.add("Radio");
        b.add("Laptop");
        b.add("shoes");
        b.add("book");
        b.add("shoes");

        List<String> c= new ArrayList<>();
        c.add("shoes");
        c.add("TV");

        b.removeAll(c);
        System.out.println(b);

    // type code to remove an element at a specific index
        //  ["Shoes", "TV", "Radio", "Laptop", "Shoes", "Book" , "Shoes"] want to remove 5th element ==>
        List<String> d = new ArrayList<>();
        d.add("shoes");
        d.add("TV");
        d.add("Radio");
        d.add("Laptop");
        d.add("shoes");
        d.add("book");
        d.add("shoes");

        d.remove(4);
        System.out.println(d);

        // example:2 create an Integer list and remove the fourth elelment
        List<Integer> e= new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);
         e.remove(3);
        System.out.println(e);
        // example:2 create an Integer list and remove the first accurence of 4
        List<Integer> f= new ArrayList<>();
        f.add(12);
        f.add(4);
        f.add(13);
        f.add(25);
        f.add(432);

        f.remove(Integer.valueOf(4));
        System.out.println(f);

        // if you use Integer list element directly inside the remove method like remove (4)
        // java will accept it as index. becasue indexes are Primitive Integers when we put 4,
        // it will be accepted as primitive and it will be index.

        // Example 6. type code to check if specific element exist in the list or not

      List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);

        boolean isExist= g.contains(5.02);
        System.out.println(isExist);

        //example 7. Type code to change the element at index 1 to 9.99

        List<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);

        h.set(1, 9.99);
        System.out.println(h);
        // set () method is for updating an element by using index

        // Example 8 : Type code to increase all salaries in an Integer list by 10%
        // [ 5000, 6000, 4500, 3900, 7200 ]
        List<Double> s = new ArrayList<>();
        s.add(5000.0);
        s.add(6000.0);
        s.add(4500.0);
        s.add(3900.0);
        s.add(7200.0);

        for (int i= 0; i<s.size(); i++){

            s.set(i, s.get(i)*1.1);
        }

        System.out.println(s);

        // how to check if two lists are same or not

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        // equals() method check if the same element are in same position.
        // if the same element are in same position equals()method returns TRUE otherwise return FALSE 
        if (m.equals(n)){
            System.out.println("The List are same");
        }else {
            System.out.println("The List are not same");
        }

        //How to check if a list contains multiple elements
        //[12, 23, 32, 14, 24, 56] ==> Check if the list has 23, 56, and 24
        List<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q = new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        //containsAll() method returns "true" if all elements exist, anyone of them does not exist it returns "false"
        boolean areExist = p.containsAll(q);
        System.out.println(areExist);//false
    }
}
