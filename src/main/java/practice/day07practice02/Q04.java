package practice.day07practice02;

public class Q04 {

    // Type a code to find the number of punctuation marks used in a String.

    public static void main(String[] args) {

        String str = "Wow!... Ali is 13 years old, and he is a university student.";

        int totalNumOfChar = str.length();
        System.out.println(totalNumOfChar);

        String strWithoutPunct = str.replaceAll("\\p{Punct}" , "");
        System.out.println(strWithoutPunct.length());

        System.out.println(totalNumOfChar - strWithoutPunct.length());

        // easier way

        System.out.println(str.replaceAll("\\p{Punct}","").length());


    }
}
