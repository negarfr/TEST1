package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01DaySession {

    public static void main(String[] args) {

        int arr[]={ 0, 2, 3, 0, 12, 0};
        int brr[]= new int[arr.length];

        int idx =0;
        for (int i = 0; i< arr.length ; i++) {

            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;
            }
        }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(brr));

// Example 2: Type code to check if a specific element exists in an array or not
        //            int crr[] = {-12, 23, 5}; check if 23 exists in the array or no

        int crr[]={-12, 23, 5};

        int counter= 0;
        int element = 23;

        for(int w: crr){

            if(w==element){

                counter++;
            }
        }
        if(counter>0){

            System.out.println("there are exist");
        }else {
            System.out.println("it is not exist");
        }
    }
}
