package day29maps;

import java.util.*;

public class QuestionsMapPractice {

    public static void main(String[] args) {

        //1) There is a Map which contains product names as key and number of the products as value.
        //   Type code to find the total number of products.

        Hashtable<String, Integer> products = new Hashtable<>();

        products.put("TV", 12);
        products.put("Xbox", 18);
        products.put("Laptop", 24);
        products.put("Music System", 87);
        System.out.println(products);

        Collection<Integer> numOfProduct = products.values();

        Integer sum = 0;
        for (Integer w : numOfProduct) {

            sum = sum + w;

            System.out.println(sum);
        }
        //  There is a Map which contains product names as key and number of the products as value.
        //       Type code to check if ‘Laptop’ is among the products.

        HashMap<String, Integer> product = new HashMap<>();

        product.put("TV", 50);
        product.put("Xbox", 18);
        product.put("Laptop", 48);
        product.put("Music System", 95);
        System.out.println(product);

        String expectedProduct = "Laptop";
        if (product.containsKey(expectedProduct)) {
            System.out.println(expectedProduct + "exist");
        } else {
            System.out.println(expectedProduct + " do not exist");
        }
        // 3) Print the prices in ascending order.

        Object[] productPrice = product.values().toArray();
        Arrays.sort(productPrice);
        System.out.println(Arrays.toString(productPrice));

        // 4)  There is a Map which contains product names as key and number of the products as value.
        // Print the product names in alphabetical order.

        HashMap<String, Integer> p = new HashMap<>();

        p.put("Didi", 12);
        p.put("Cicki", 13);
        p.put("Alba", 14);
        p.put("Bambo", 15);
        p.put("Eco", 16);
        System.out.println(p);

        Set<String> sortedP = p.keySet();
        System.out.println(sortedP);

        List<String> sortedPAsList = new ArrayList<>(sortedP);
        System.out.println(sortedPAsList);

        // **** VERY, VERY IMPORTANT QUESTION***
        // Type code to count the number of occurrences of the words in a String. (Case insensitive)
        // sentence :  "Apex is easy. Type codes to learn apex. To earn money learn apex."

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        // reMOVE punctual
        s = s.replaceAll("\\p{Punct}", " ");
        System.out.println(s);
        // split all word
        String[] splitS = s.split(" ");
        System.out.println(Arrays.toString(splitS));// [Apex, is, easy, , Type, codes, to, learn, apex, , To, earn, money, learn, apex]

        // Create Map

        HashMap<String, Integer> occurrencesMap = new HashMap<>();

        for (String w : splitS) {//[Apex, is, easy, , Type, codes, to, learn, apex, , To, earn, money, learn, apex]

            Integer numOfOccurrences = occurrencesMap.get(w);

            if (numOfOccurrences==null){   // if null because at first nothing there

                occurrencesMap.put(w,1);

            }else {
                occurrencesMap.put(w, numOfOccurrences+1);
            }
        }
        System.out.println(occurrencesMap);






    }
}

