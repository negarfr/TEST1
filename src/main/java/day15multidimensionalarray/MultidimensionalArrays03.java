package day15multidimensionalarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimensionalArrays03 {

    public static void main(String[] args) {
        // example1-convert multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String arr [][] = { {"learn", "java", "it"}, {"is", "easy"} };

        // Step 1. is to find total number of elements in the multidimensional array
        int sum = 0;
        for (String[] w : arr){
            sum = sum+w.length;
        }
        // step 2. Create one dimensional array by using total number of elements in multidimensional array
        String brr[]= new String[sum];
        System.out.println(Arrays.toString(brr));
        // step 3. TRANSFER the elements from Multidimensional Array to one dimensional array
        int idx = 0;
        for (String[] w :arr){

            for (String u :w){
                brr[idx]=u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));


    }
}
