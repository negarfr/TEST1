package day26exceptions;

public class E01 {

    public static void main(String[] args) {

        printAge(25);// when you call a method, you use actual values inside the method paranthesis, the called "arguments"

        try {
            printAge(-25);
        }catch (IllegalArgumentException e){
            System.out.println("Age is not valid");
        }
        printWorkerAge(17);

    }

    public static void printAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age can not be negative");
        }
        System.out.println(age);
    }

    // create a method to print workers age

    public static void printWorkerAge(int age) {

        if (age < 16) {
            throw new IllegalArgumentException();
        }
        System.out.println(age);
    }
}
