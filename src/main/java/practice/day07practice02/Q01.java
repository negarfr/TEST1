package practice.day07practice02;

import java.util.Scanner;

public class Q01 {

   // Ask user to enter a character, if it is vowel print "Vowel" and if it is not vowel print "Not vowel".
    // vowel ==> a-e-i-o-u

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a letter to check if it is vowel or not");

       char c= input.next().toLowerCase().charAt(0);

       switch (c){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               System.out.println("vowel");
               break;

           case 'b':
           case 'c':
           case 'd':
           case 'f':
           case 'g':
           case 'j':
           case 'k':
           case 'l':
           case 'm':
           case 'n':
           case 'p':
           case 'q':
           case 'r':
           case 's':
           case 't':
           case 'v':
           case 'w':
           case 'x':
           case 'y':
           case 'z':

               System.out.println("Not vowel");
               break;
           default :
               System.out.println("Enter a letter not the other characters");



       }

    }
}


