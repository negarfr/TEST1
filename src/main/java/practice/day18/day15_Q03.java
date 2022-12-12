package practice.day18;

public class day15_Q03 {

    public static void main(String[] args) {
        //Type code to check if a given integer is palindrome or not
        // palindrome :121 <==> 121, nalan <==> nalan

        String str1= "Nalan";

        String reversed = "";

        int i =str1.length()-1;

        while (i>-1) {

            reversed = reversed + str1.charAt(i);

            i--;

        }
        if (str1.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        System.out.println();
        System.out.println("===============================");

        String strI2= "ey edip adanada pide ye";
        String reversed2= "";

        int idx = strI2.length()-1;

        while(idx>-1){

            reversed2 = reversed2 + strI2.charAt(idx);

            idx --;
        }
        if (strI2.equals(reversed2)){

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
    }

