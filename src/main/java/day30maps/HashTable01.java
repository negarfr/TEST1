package day30maps;

import day23encapsulationabstraction.Student;

import java.util.Hashtable;

        /*
        1) HashTable is a Map
        2) HashTable does not put entries to any order
        3) HashTable is slower than HashMap
        4) HashTable thread-safe and synchronized but HashMap is not

         */

public class HashTable01 {

    public static void main(String[] args) {

        Hashtable<String,Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Turkey",81000000);

        System.out.println(countryPopulations);

        // Example 1- Store student names together with their email addresses,ages, nationality
        //              Tom Hanks = th@gmail.com,21, 2, American

        Hashtable<String, Students> studentInfo = new Hashtable<>();

        studentInfo.put("Tom Hanks", new Students("th@gmail.com",21,2, "American"));
        studentInfo.put("Brad Pit", new Students("bp@gmail.com",22,3, "Colombian"));
        studentInfo.put("Angelina Julie", new Students("ag@gmail.com",19,1, "Peru"));

        System.out.println(studentInfo);

        // How to see the details about the students like Tom Hanks Age
       Students tomInfo = studentInfo.get("Tom Hanks");
        System.out.println(tomInfo.nationality);
        System.out.println(tomInfo.age);





    }
}
