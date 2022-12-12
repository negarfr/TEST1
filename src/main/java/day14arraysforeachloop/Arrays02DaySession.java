package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02DaySession {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date= "09/20/2022";

        String dateArray[]= date.split("/");
        System.out.println(Arrays.toString(dateArray));
        System.out.println("Month:"+dateArray[0]);
        System.out.println("Day:"+ dateArray[1]);
        System.out.println("Year:"+ dateArray[2]);




    }
}
