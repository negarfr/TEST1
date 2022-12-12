package day13arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

       String names []= new String[5];

        System.out.println(Arrays.toString(names));

        names[4]="Mark";
        names [0]= "Jim";
        names [2]= "Merry";
        names [3]= "Susan";
        names [1]= "Tom";

        System.out.println(Arrays.toString(names));

//Example 1: Create an integer array and print the sum of the first and the last elements on the console

        int ages[]= new int[7];

        System.out.println(Arrays.toString(ages));
        ages [0]=12;
        ages [1]=23;
        ages [2]=25;
        ages [3]=14;
        ages [4]=17;
        ages [5]=12;
        ages [6]=14;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);

        // create a double Array and file the sum of the all elements
        //       [1.2, 2.3 , 5.0 , 4.51 ] ==> 13.01

        double prices [] = new double[4];

        prices[0]= 1.2;
        prices[1]= 2.3;
        prices[2]= 5.0;
        prices[3]= 4.51;
        System.out.println(Arrays.toString(prices));

         double sum = 0;
        for (int i = 0; i < prices.length; i++) {
         sum = sum+ prices[i];
        }
     System.out.println(sum);
        //2.Way. we will solve the text by using for each loop

     double summy = 0;
     for(double w : prices ){
      summy = summy + w;

     }
     System.out.println(summy);
    }
}
