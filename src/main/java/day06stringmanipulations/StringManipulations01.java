package day06stringmanipulations;

import java.util.Scanner;


public class StringManipulations01 {
       public static void main(String[] args) {

        //1.Example: Print the first and last character of the given String on the console. "Java is easy" ==> Jy

       Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String str= input.nextLine();

        //1.way :by using charAT():
        char firstChar = str.charAt(0);

       char lastChar= str.charAt(str.length()-1);

        System.out.println(firstChar + lastChar);

        // if we use char date type in a math operation Java use ASCII values not the characters
        System.out.println( ""+ firstChar + lastChar); //Note:when you put "" at the beginning you will concatenation
        // operation and you and you will get String

        //2-way : By using substring()
       String firstCharacter = str.substring(0,1); // substring (0,1) gives you first character everytime

           String lastCharacter= str.substring(str.length()-1);

        // substring (beginning index) gives you the
        // character from a specific index to the last
        System.out.println(firstCharacter + lastCharacter);

       // example2- print just the animal names form the String : " I Like Lion, Horse, Laptop and cat"


        String s = "I Like Lion, Horse, Laptop and cat";
        String lion = str.substring(7,11);
        String horse = str.substring(13,18);
       String cat= s.substring(31);

        System.out.println(lion+horse+cat);

        // 3.Example: Type code to get initials of the first name and the last name of given name. Ali can==> AC,
        // Mary Star ==> MS



        String name = "Tom Hanks";
        String initialOfFirstName= name.substring(0,1);
        String  initialOfLastName= name.split("")[1].substring(0,1);
        System.out.println(initialOfFirstName + initialOfLastName );

        //4.Example: Type code to find the number of words in a String; "I like to move it, move it" ==> 7
        String word = "I like to move it, move it. Wow it is perfect.";

        int numOfWords = word.split(" ").length;

        System.out.println(numOfWords);

    }
}
