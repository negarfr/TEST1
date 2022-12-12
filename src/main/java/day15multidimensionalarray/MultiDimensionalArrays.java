package day15multidimensionalarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        int arr[][] = new int[4][2];

        // how to print a multidimensional Array
        System.out.println(Arrays.deepToString(arr));

        // how to assign values to multidimensional array elements
        arr[2][1] = 7;
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[1][0] = 5;
        arr[1][1] = 9;
        arr[2][0] = 10;
        arr[3][0] = -3;
        arr[3][1] = 8;
        System.out.println(Arrays.deepToString(arr));
        // how to create multidimensional Array in short way

        String brr[][] = {{"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"}};
        System.out.println(Arrays.deepToString(brr));
        // how to create a specific element from a multidimensional array

        System.out.println(brr[2][1]);
        // how to print specific element from outer array
        System.out.println(Arrays.toString(brr[2]));
//example1-type code to find the number of elements in Multidimensioanl array
        String crr[][] = {{"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"}};

        int sum = 0;
        for (String[] w : crr) {
            sum = sum+w.length;
        }
        System.out.println(sum);
        //
    }
}