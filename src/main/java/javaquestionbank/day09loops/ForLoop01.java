package javaquestionbank.day09loops;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1- Type code to print to reverse a string
                // for example String will be Tom print it at moT

        String name= "Mark";

        String reversedName = "";

        for (  int i=name.length()-1   ;  i>=0  ; i--){

            char ch= name.charAt(i);

            reversedName = reversedName +ch;
        }
        System.out.println(reversedName);

        //e.2) Find the sum of the integers from 3 to 6

        int sum = 0;

        for ( int i= 3 ; i<7 ; i++){

           sum= sum + i;
        }
        System.out.println(sum);

        // e.3) find the multiplication of the integers from 3 to 6

        int multiplication = 1;

        for ( int i= 3; i<7 ; i++){

            multiplication = multiplication*i;

        }
        System.out.println(multiplication);

        //e.4) Type the code to find the sum of the digits of an integer
        // 584 ==> 5+8+4= 17
        // Note : "number % 10" gives you the last digit

        int num = -584;

       num = Math.abs(num);

        int sumOfDigits = 0;

        for (int i = 584 ; i>0 ; i=i/10 ) {

            sumOfDigits = sumOfDigits + i%10;

        }
        System.out.println(sumOfDigits);

    }
}
