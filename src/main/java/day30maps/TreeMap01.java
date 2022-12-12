package day30maps;

import java.util.*;

public class TreeMap01 {

    /*
    1) TreeMap puts the entries in " Natural order " according to keys
    2) TreeMap is the slowest Map
    3) TreeMap is NOT tread-Safe and not Synchronized means you can not use

     */

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Turkey",81000000);
        countryPopulations.put("Afghanistan",71000000);
        System.out.println(countryPopulations);
        //If the "key" inside the ceilingEntry() method parenthesis is the same with any key inside the TreeMap,
        // you will get the entry itself.
        //If the "key" inside the ceilingEntry() method parenthesis is before any key, it returns the next entry.

        Map.Entry<String, Integer> abc = countryPopulations.ceilingEntry("G");
        System.out.println(abc);

        NavigableSet<String> keysInDescendingKeySet  = countryPopulations.descendingKeySet();
        System.out.println(keysInDescendingKeySet);

        NavigableMap<String, Integer> mapInDescendingOrder=  countryPopulations.descendingMap();
        System.out.println(mapInDescendingOrder);

        Map.Entry<String,Integer> ghi = countryPopulations.lowerEntry("Germany");
        System.out.println(ghi);
        //lowerEntry("Germany") method gives the previous entry under every condition but floorEntry("Germany") method
        // gives the same entry for the existing keys
        //lowerEntry("Germany") method is like "<", floorEntry("Germany") is like "<="

        Map.Entry<String,Integer> def = countryPopulations.floorEntry("Germany");
        System.out.println(def);


        SortedMap<String,Integer> subMap1 = countryPopulations.subMap("Afghanistan", "Turkey");
        System.out.println(subMap1);

    }
}
