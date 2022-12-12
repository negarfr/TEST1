package day29maps;

import java.util.*;

public class Hashmap03 {

    public static void main(String[] args) {

        // Example 1- Type code to print the number of occurrences of word in a sentence
        // for example : I like to move it, move it do you like it?" ==> I=1, Like=2 , to=1, Move=2, it=3, do=1, you=1

        String sentence = "I like to move it, move it do you like it?";

        // *** remove punctuation marks

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);


        // Example 1- Type code to print the number of occurrences of letters in a sentences (Alphabetical Characters)

        String song = "I like to move it, move it do you like it?";

        song = song.replaceAll("\\p{Punct}", "");
        System.out.println(song);

        for (int i = 0; i < song.length(); i++) {
            System.out.println(song.charAt(i));
        }

            HashMap<String, Integer> occurrenceMap1 = new HashMap<>();





    }


}

