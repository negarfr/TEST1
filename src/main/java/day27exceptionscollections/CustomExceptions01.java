package day27exceptionscollections;

public class CustomExceptions01 {

    /*
     Normally, Java has many Exception classes which cover many issues
     Sometimes we need custom exception for 2 reason:
     1) to make Java Exceptions more specific.
       "FileNotFoundException" has 2 reasons in it: i) path can be wrong  ii) file does not exist
     2) to create some Exceptions for our application
       "IllegalGradeException" can be created for a school management system application
     3) Custom exceptions directs the developers not to break the application rules
*/

    public static void main(String[] args) {


        try {
            printGrades(-45);
        } catch (IllegalGradeExceptions e) {
            e.printStackTrace();
        }
        System.out.println(checkNameFormat("tom"));
    }

    public static void printGrades(double grade) throws IllegalGradeExceptions{
        if(grade<0 || grade>100){
            throw new IllegalGradeExceptions("Grade cannot be less than zero and more than hundred");
        }else{
            System.out.println(grade);
        }
    }

    public static boolean checkNameFormat (String name){

        if (name.charAt(0)>='A' && name.charAt(0)<='z' ){
            return true;
        }else {
            throw new IllegalNameException("Names must start with super cases");
        }

    }

}


