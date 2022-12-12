package day07stringmanipulations;

public class StringManipulations01 {


    public static void main(String[] args) {
         String str = "Java is easy";
         boolean isExist= str.contains("Java");
        System.out.println(isExist);

        boolean result =str.startsWith("J");
        System.out.println(result);

       boolean res= str.startsWith("i" , 5);
        System.out.println(res);

       /*
    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total
 */


        String pwd = "xy1AmSW";

       // i) has "A" in any position

        boolean firstRule = pwd.contains("A");

        boolean secondRule = pwd.startsWith("XY");

        boolean thirdRule = pwd.startsWith("W", 6);

        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password Valid ?" + (firstRule && secondRule && thirdRule && fourthRule));







    }
}