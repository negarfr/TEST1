package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List04dt {

    public static void main(String[] args) {

        //Example 1: Find the closest 2 integers in the given list. [12, 15, 10, 21]
        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);
        int minDiff = Integer.MAX_VALUE;
        for (int i=1; i<a.size(); i++){
            minDiff= Math.min(minDiff, a.get(i)-a.get(i-1));

        }
        System.out.println(minDiff);

        for (int i=1; i<a.size(); i++){

            if (a.get(i)- a.get(i-1)== minDiff){

                System.out.println(a.get(i) + "and" + a.get(i-1));
            }
        }
        // Increase  number by 3 except 7
        List<Integer> b = new ArrayList<>();
        b.add(11);
        b.add(31);
        b.add(22);
        b.add(7);
        b.add(15);
        System.out.println(b);
       for (Integer w : b) {
           if (w==7){
               continue;
           }
           b.set(b.indexOf(w),w+3);
       }
        System.out.println(b);
       // 3) convert all element to "*" except the last 4 element
        
        }
    }

