package day27exceptionscollections;


// when you "extend" to "RuntimeException class " you "Custom Exception" will be RuntimeException

public class IllegalNameException extends RuntimeException{

    public IllegalNameException(String message){

        super(message);
    }

}
