package day05ternarystringmanipulations;

public class NestedTernary01 {

    public static void main(String[] args) {

        int year = 2021;

    String isLeap = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap");
        System.out.println(isLeap);
 /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
*/

    String pwd = "ia1b3cXyz";

    String isValid= pwd.length()>8 ? (pwd.charAt(0)=='i' ? "valid" : "Invalid") : (pwd.charAt(0)=='k' ? "valid" : "Invalid");

        System.out.println(isValid);

    }
}
