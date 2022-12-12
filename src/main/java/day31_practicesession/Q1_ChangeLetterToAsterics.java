package day31_practicesession;

import java.util.Scanner;

public class Q1_ChangeLetterToAsterics {

    //Ask user to enter his/her name, surname and credit number and convert all characters in
    //name and surname to asterics except for the initials. Also convert all numbers in credit card to
    //asterics except for the last 4 digits

    public static void main(String[] args) {
        try {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name, Surname and Creditcard Number");
            String str = input.nextLine();

            String name = str.split(" ")[0];
            String sureName = str.split("")[1];
            String cardNum = str.split("")[2];

            String hiddenName = name.replaceAll("[a-z]", "*");
            String hiddenSureName = name.replaceAll("[a-z]", "*");

            // for now this will be emapty until after loop
            String hiddenCardNum = " ";

            for (int i = 0; i < cardNum.length(); i++) {

                if (i < cardNum.length() - 4) {

                    hiddenName = hiddenName + "* ";
                } else {
                    hiddenName = hiddenName + cardNum.charAt(i);
                }
            }
            System.out.println(hiddenName + " " + hiddenSureName + " " + hiddenCardNum);

        }catch (Exception e){
            System.out.println("please check your credentials again ");
    }

}
}

