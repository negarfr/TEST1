package javaquestionbank;

import java.time.LocalDate;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {

        // 4) Enter code to calculate the age

      Scanner input = new Scanner(System.in); //create an object and get data from User via Scanner
        System.out.println("Enter date of birth to calculate age");
        int dob = input.nextInt(); // method for int date of birth
        int age = calculateAge(dob); // method for int data for calculate the age
        System.out.println(age);

        }
        public static int calculateAge(int dateOfBirth){

        return LocalDate.now().getYear()-dateOfBirth;
        }
    }

