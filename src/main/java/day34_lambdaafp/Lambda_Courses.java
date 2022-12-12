package day34_lambdaafp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Courses {
    private static Object List;

    // Pojo class -   Note: We put our constantly needed variables in POJO Class

    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        // created new object from our Courses class our parameters in it. this means Pojo
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);


        System.out.println(checkAvgScoresToBeGreaterThanGivenNum(coursesList, 92));//true
        System.out.println(checkIfAnyCourseNameContainsGivenWord(coursesList, "German"));
        System.out.println(getCourseNameWhoseAvgIsTheHighest(coursesList));//Turkish Night
        System.out.println(sortCourseWithAverageScoreInAscendingSkipFirstGiven(coursesList, 2));

    }
        // Task 1- Create a method to check if all averge score are greater than given number
    public static boolean checkAvgScoresToBeGreaterThanGivenNum(List<Courses> list, double avgScore) {

        // have to tell java go to listcourse to check as list and if is double and if have named of avgScore ( which is given number )

        return list.stream().allMatch(t -> t.getAverageScore() > avgScore);

        // in this part " list.stream()" ==> we have :(courseTurkishDay)-(courseTurkishNight)
        // with allMatch method ==>  all data from each course by getAverageScore(),all numbers adds up and compare with aveScore (khodemon migzarim )
        // will be check
        // baraye javab boolean migzarim choon task khaste ke "check" shavad
        // dar akhar dar method asli Method ra seda mikonim.
    }
        // TASK 2- CREATE A METHOD TO CHECK IF AT LEAST ONE OF THE COURSE NAMES CONTAINS GIVEN WORD
        public static boolean checkIfAnyCourseNameContainsGivenWord(List<Courses> list, String word){

            return list.stream().anyMatch(t-> t.getCourseName().contains(word));

        }
    //3)Create a method to print the course whose average score is the highes

    public static String getCourseNameWhoseAvgIsTheHighest(List<Courses> list){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore).reversed()).findFirst().get().getCourseName();

    }
    //4) Sort the list elements according to the average score in ascending order and skip first given one.

    public static List<Courses> sortCourseWithAverageScoreInAscendingSkipFirstGiven(List<Courses> list, int num){

        return list.stream().sorted(Comparator.comparing(Courses::getAverageScore)).skip(num).collect(Collectors.toList());
    }

    //5) Homework: Sort the list elements according to the average score in ascending order and print just the given one







}