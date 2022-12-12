package day13arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Let user to Entre student name into the application
        // (create an Array together with the user)

        Scanner input= new Scanner(System.in);
        //1. Create an Array
        System.out.println("Enter the number of the students you want to entre");
        int nameOfStd = input.nextInt();

        String names[]= new String[nameOfStd];
        System.out.println(Arrays.toString(names));
        // Step 2. Insert the element into the array
        for (int i = 0; i < nameOfStd ; i++) {
            System.out.println("entre the students names");
            String stdName = input.next();

            names [i]=stdName;
            System.out.println(Arrays.toString(names));

        }
    }
}
