package day27exceptionscollections;

// to make my class child of the Exception class need to use "extends" keyword

// if you use "extends Exception" it will be "Compile Time Exception " (or Checked Exception)
public class IllegalGradeExceptions extends Exception{

    public IllegalGradeExceptions (String message){
        super(message);

    }


}
