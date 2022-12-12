package day29maps;

import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        /* HashMap Mechanism =
        1) when you create a HashMap Java Create 16 Buckets in Memory and index them from "0" to "15"
        2) when you use put() method Java create an Integer HashCode and calculate HashCode%16
        3) the result of HashCode%16 will be the index to select Bucket
        4) After selecting the Bucket Java will put the Entry into the selected Bucket as a node of LinkedList
        5) Every node will have 4 parts in it i)HashCode ii)key iii)Value iv) pointer
        6) Java Makes every HashCode Unique, but sometimes java can create Same HashCode accidentally,
            this called " HashCode Collision".
        7)" HashCode Collision" are common phenomena of hashing function.
        8) if the key is "null" hashcode will be Zero, that's why the entry whose key is null will be put into the Buckets
            whose index is Zero
         */

        HashMap<String,Double> coursePrices = new HashMap<>();
        coursePrices.put("Full Stack Java Development Course", 6000.00);
        coursePrices.put("Full Stack Automation Engineer ", 5800.00);

        coursePrices.put("Sales force Development", 4500.00);
    }
}
