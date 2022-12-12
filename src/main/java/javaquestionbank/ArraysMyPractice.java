package javaquestionbank;
import java.util.Arrays;
public class ArraysMyPractice {
    //1) Find the middle element in an integer array
    //Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
    // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

    public static void main(String[] args) {

        int a [] = {12, 5,8, 13};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        if (a.length%2!=0){
            Integer indexOfMiddleElement =a.length/2;
            System.out.println(indexOfMiddleElement);
        }else{
            Integer indexOfMiddleElement =a.length/2;
            Integer averageValue = (a[indexOfMiddleElement]+a[indexOfMiddleElement-1])/2;
            System.out.println(averageValue);
        }
    //) Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2

        int num[]={-12, 18, -5, 23, -2};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for (Integer w: num){
            System.out.println(w);
            System.out.println("===================");

        // Find the elements whose length is the smallest in a String array
            //Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli




        }

        }


    }

