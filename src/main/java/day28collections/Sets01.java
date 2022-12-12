package day28collections;

import java.util.*;

public class Sets01 {
/*

1) STES are for storing multiple non-primitive data in the same data type
2) SETS are for storing UNIQUE DATA ( you can not put repeated data) like : email addresses, NI numbers, Phone numbers
3) there are 3 diff SETS; i- HashSet: uses " Hashing Technique "
                             * it does not put the element is any order.
                             * HashSet accepts just a single "null" as element
                          ii-LinkedHashSet: Puts the elements in "Insertion Order "
                          iii- TreeSet : Puts the elements in "Natural Order"(Ascending Order in numbers,Alphabetical Order in String )
                                         TreSet is so slow in adding elements.
 Question: If you need to store "unique elements" in "natural order", which collection do you use?
                  Answer: TreeSet
        Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
                  i)Create a HashSet
                  ii)Add elements into the HashSet
                  iii)Convert HashSet to TreeSet
 */
public static void main(String[] args) {

    // HashSet
    HashSet<String> emails = new HashSet<>();
    System.out.println(emails);//[]

    emails.add("Apple");
    emails.add("Mango");
    emails.add("Orange");
    emails.add("Apricot");
    emails.add("Fig");
    emails.add("Mango");// when you try to add repeated data, java does not give error.

    emails.add("null");
    System.out.println(emails);

    emails.remove("Fig");
    System.out.println(emails);

  emails.clear();// deletes all elements from HashSet
    System.out.println(emails);


    // WHEN YOU USE clone() Method, you can make data type "OBJECT"
    Object emails2 =  emails.clone();
    System.out.println(emails2);

    HashSet<String> emails3 = (HashSet<String>) emails.clone();
    System.out.println(emails3);

        // LinkedHashSet
    LinkedHashSet<Integer> ssn = new LinkedHashSet<>();

    ssn.add(123456789);
    ssn.add(234567891);
    ssn.add(345678912);
    ssn.add(456789123);

    System.out.println(ssn);

    // TreeSet
    //way.1
    Long starting = System.currentTimeMillis();
    TreeSet<Integer> nums1 = new TreeSet<>();
    nums1.add(23);
    nums1.add(5);
    nums1.add(17);
    nums1.add(67);
    nums1.add(41);
    nums1.add(-5);
  // TreeSet does not accept "null" as element

    System.out.println(nums1);
    Long middle = System.currentTimeMillis();
    //way.2
    HashSet<Integer> nums2 = new HashSet<>();
    nums2.add(23);
    nums2.add(5);
    nums2.add(17);
    nums2.add(67);
    nums2.add(41);
    nums2.add(-5);


    Long ending  = System.currentTimeMillis();

    TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
    System.out.println(perfectNums);

    System.out.println("1.way:"+(middle-starting));
    System.out.println("1.way:"+(ending-middle));




        }
}
