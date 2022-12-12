package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // Example 1.[0, 2, 3, 0, 12, 0] put the zeros to the end

        // this mean we should convert the 0 to the end

        int arr[]= {0, 2, 3, 0, 12, 0};
        int brr []= new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length;   i++) {
            if(arr[i]!=0){
                brr [idx]= arr [i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        // Example 2: Type code to check if a specific element exists in an array or not
        // int crr[]={-12, 23,5} check if 23 is exists in this Array or not ?

        int crr[]={-12, 23,5};

        int counter = 0;
        for( int w: crr){
            if (w==23) {
                counter++;
            }
        }
        if (counter >0) {
            System.out.println("there are exist");
        }else {
            System.out.println("it is not exist");
        }
    }
}
