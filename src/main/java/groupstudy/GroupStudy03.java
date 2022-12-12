package groupstudy;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GroupStudy03 {




    public static void main(String[] args) {


       /*
       IMPORTANT QUESTION : Type code to print the number of occurrences of words in a sentence
                            “I like to move it, move it do you like it?” => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        */
        String song = "I like to move it, move it do you like it?";

        // remove punctuates

        song= song.replaceAll("\\p{Punct}"," ");
        System.out.println(song);

        // split all the words
        String[] splitSong = song.split(" ");
        System.out.println(Arrays.toString(splitSong));

        // now ready to create Map
        HashMap<String,Integer> occurrenceMap = new HashMap<>();// []

        for (String w : splitSong){ // [I, like, to, move, it, , move, it, do, you, like, it]

           Integer numOfOccurrence = occurrenceMap.get(w);

           if (numOfOccurrence==null) {

               occurrenceMap.put(w, 1);
           }else {
               occurrenceMap.put(w, numOfOccurrence+1);
           }
        }
        System.out.println(occurrenceMap);

         /*  3.  Given int number
         print all the even numbers from 0 to int number
         Example 1: int input = 10;       print should be 0 2 4 6 8 10
         Example 2:   int input = 15;    print should be 0 2 4 6 8 10 12 14
         */
        Scanner input = new Scanner(System.in);
        System.out.println("give int number please");
        int num = input.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
        /* 4. Given a String ,
           if the count of the letter in the String is odd print true else print false
         */
        Scanner input2 = new Scanner(System.in);
        System.out.println("give me String");
        String letter = input2.next();
        String onlyLetters = letter.replaceAll("[^A-Za-z]+", "");
        System.out.println(onlyLetters);

        if (onlyLetters.length() % 2 != 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

      /*  5. Given three positive Strings,  remove all the non-numeric numbers.
              change the Strings to int and print the total
              Example:   String num1 = "$15";
                         String num2 = "$20";
                         String num3 = "$30";
                         output should be ==  65;
            NOTE : if the output less than 0 change output to -1
       */
       Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the out put");
        String TTL = input3.next();













       /* 2. Given two string by using scanner class and add each other
        if first word last letter is same with second word first letter then remove one of them.
        Example: “abc”, “cat” --> “abcat”       “abc”, “dog” -->“abcdog”
     */
        //First we need to create "Scanner"
        Scanner scan = new Scanner(System.in);

//If we want, we can get the 2 words we need from the user.
        System.out.println("enter two element");

//We must create an empty string to put the elements we will use.
        String  allElements = scan.nextLine();

//We must create separate indexes for the entered elements. That's why we use the split() method.
// When we split, the index of the 1st element becomes 0, that of the 2nd element 1.
// It gives us the split() method, its rule.
        String[] elements = allElements.split(" ");
        String s1 = elements[0];
        String s2 = elements[1];

//We need the last character of element s1. How can we find this?
// We can find it using substring(int beginIndex):s1.substring(s1.length()-1)

//We need to find the first character of the second element, namely s2.
// We can find this again with substring(int beginIndex, int endIndex):(s2.substring(0,1)

//If the last character of s1 is the same as the first character of s2,
// use the replace() method to replace the last character of s1 with nothing.
// Why did we create s3? Because we replaced s1 with replace() to combine 2 elements.
// If this condition cannot be met, that is, if we cannot combine, we call Java to add s1 and s2.

        if(s1.substring(s1.length()-1).equals(s2.substring(0,1))){
            String s3=s1.replace(s1.substring(s1.length()-1),"");
            System.out.println(s3+s2);
        }else{
            System.out.println(s1+s2);
        }





    }
}
