package javaquestionbank;

public class ForLoopMyPractice {

    public static void main(String[] args) {

        //) Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers

        String s = " ";
        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                s = s + i + "";
            }
            System.out.print(s + "");
        }
        System.out.println();
//Type code to draw the following image by using a for loop
        //  A A A A A
        // A A A A A
        // A A A A A
        int rows = 3;
        int columns = 5;
        for (int i = 1; i <= rows; i++) {
            String m = "";
            for (int k = 1; k <= columns; k++) {
                m = m + "A";
            }
            System.out.println(m);
        }

        }
    }

