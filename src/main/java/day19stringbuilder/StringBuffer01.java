package day19stringbuilder;

public class StringBuffer01 {

    public static void main(String[] args) {

        /*
        StringBuffer is another class to create String in Java.

         */

        StringBuilder str = new StringBuilder("LearnJava");
        StringBuilder revStr = str.reverse();
        System.out.println(revStr);

        String str2 = "LearnJava";
        String str3 = "";
        for (int i = str2.length() - 1; i >= 0; i--) {

            str3 = str3 + str2.charAt(i);
            System.out.println(str3);

            String str4 = "Learn";
            System.out.println(str4 + "Java");

        }

        StringBuilder sb5 = new StringBuilder("Learn");
        System.out.println("Before trim:" + sb5.capacity());
    sb5.trimToSize();
        System.out.println("After trim:" + sb5.capacity());

        StringBuilder sb = new StringBuilder(9);
        System.out.println(sb.length() + " - " + sb.capacity());

    }
}

