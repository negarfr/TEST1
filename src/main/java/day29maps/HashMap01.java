package day29maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

   /*
        1)Maps have key - value structure
        2)Key's are unique but value's are not
        3)Every element in a Map is called as "Entry"
        4)All elements are called as "EntrySet"
        5)Key cannot be null in Maps except HashMap but value can
        6) HashMap put the entries in Random order, because of that it is super-fast
    */
    // when you create MAP, you will have TWO PARTS : " KEY " and " VALUE "//

    public static void main(String[] args) {

        //How to create HashMap
        HashMap<String, Integer> stdAge = new HashMap<>();

        //How to put entries into HashMap

        stdAge.put("Ali Can", 13);
        stdAge.put("Tom Hanks", 46);
        stdAge.put("Brad Pit", 55);
        stdAge.put("Angelina Julie", 48);

        System.out.println(stdAge);

        // how to get just keys
        Set<String> keys = stdAge.keySet();
        System.out.println(keys);

        // how to get just values
        Collection<Integer> ages = stdAge.values();
        System.out.println(ages);

        // Can we put null into key ? YES you can BUT just in HashMap keys
        stdAge.put(null, 23);
        System.out.println(stdAge);
        // Can we put null into key ?
        stdAge.put("Arci France", null);
        System.out.println(stdAge);

        // ** what happens if you use same key repeatedly ? Java accept the final value for the key(over writing)

        stdAge.put("Angelina Julie", 23);
        System.out.println(stdAge);

        // How to get a Value of a key ?
        Integer tomAge = stdAge.get("Tom Hanks");
        System.out.println(tomAge);

        // if the key does not exist when you use get() method what happens ? It will return null
        Integer unknownAge = stdAge.get("Abc Xyz");
        System.out.println(unknownAge);

        // getOrDefault("Abc Xyz", 0); method returns the value of "Abc Xyz" if Abc exists among the keys
        //                             returns the values of second parameter if Abc Xyz does not exist among the keys.
        Integer unknownAge2 = stdAge.getOrDefault("Abc Xyz", 0);
        System.out.println(unknownAge2);

        // I want to put an entry if it does not exist, if the entry exist I will not put it.
        stdAge.putIfAbsent("Brad Pit", 44);
        System.out.println(stdAge);

        stdAge.putIfAbsent("David Barlow", 44);
        System.out.println(stdAge);

        // How to update the Value of the Key after checking key and the exsiting Value
        stdAge.replace("Tom Hanks", 56);
        System.out.println(stdAge);

        //
        stdAge.replace("Tom Hanks",56,66);
        System.out.println(stdAge);

        // How to remove key
        stdAge.remove("someone unknown");
        System.out.println(stdAge);

        stdAge.remove("David Barlow",44);
        System.out.println(stdAge);

        // *** How to get entries one by one from a method ?

      Set<Map.Entry<String,Integer>> entries = stdAge.entrySet();

      for (Map.Entry<String,Integer>  w : entries ){

          System.out.print(w + " !");
      }


    }

    }

