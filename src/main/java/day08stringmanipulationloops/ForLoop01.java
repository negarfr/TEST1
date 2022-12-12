package day08stringmanipulationloops;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example 1- Type a code to print "Hi" 5 times on the console

        //1. way : there is repetition and is difficult to type also difficult to maintain and update.
        // NOT RECOMMENDED
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // sometimes we need to repeat in coding,
        // way.2 : TO DO REPEATED ACTIONS WE USE "LOOP"
        // there are 4 loops in java :1)for-loop 2)while-loop 3)do-while-loop 4)for-each-loop

        //i)for-loop
        // starting value;  condition ;Increment/decrement

        for ( int i = 1 ;   i<6   ;   i++      ){
            System.out.println("Hi!");
        }
        // Example 2:type all integers from 11 to 44 in the same line with a space consecutive integers

        for (int i= 11; i<45 ; i++){
            System.out.print(i+" ");
        }
        // Example 3: type all integers from 44 to 11 in the same line with space consecutive integers

        System.out.println();

        for(int i= 44; i>10 ; i--){
            System.out.print(i+" ");
        }
        // Example 4: type even integers from 11 to 44 in the same line with space consecutive integers

        System.out.println();

        for( int i= 11; i<45 ; i++){

            if (i%2==0){
                System.out.print(i + " ");
            }
        }
//5.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers
        for( int i= 68; i>12 ;i-- ){

            if (i%2 !=0){
                System.out.print(i + " ");
            }
        }


        System.out.println();

        //6.Example: Type all integers which are divisible by 4 and not divisible by 6 from 120 to 11
        // in the same line with a space between consecutive integers

        for ( int i= 120; i>10 ; i--) {

            if (i % 4 == 0 && i % 6 != 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = 0; i <=10 ; i++) {

            if(i%2==0)
            System.out.print(i + " ");

        }
       // Write a program to add counting numbers from 23 to 57 by using for-loop.
               // Print the sum on the console
        System.out.println();
        int sum =0;
        for (int j = 23 ; j <57 ; j++) {
            sum = sum+j;

            System.out.print(sum+ " ");

        }



    }
}
