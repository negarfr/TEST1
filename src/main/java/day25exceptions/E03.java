package day25exceptions;

public class E03 {

    public static void main(String[] args) {

        // create a method to find the number of Charactors in String

        int r1 = getNumOfChars("Tom Hanks");//9
        System.out.println(r1);

        int r2 = getNumOfChars("");
        System.out.println(r2);

        int r3 = getNumOfChars(null);//NullPointerException : if you use "length()" method
        System.out.println(r3);
    }

    public static int getNumOfChars(String str) {
        int numOfChar = 0;
        try {
            numOfChar = str.length();

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return numOfChar;
    }
}
