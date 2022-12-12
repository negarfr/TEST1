package day11constructorsmethodcallstatickeyword;

public class Car {
  /*
        1)Constructors are used to create object from a class
        2)Java puts default constructors inside every class
        3)Default constructors does not have any parameters inside the constructor parenthesis
        4)Constructor names must match with the class names
        5)In a class we can have multiple constructors
        How to create a constructor?
        1)Type access modifier
        2)TYpe the class name as constructor name
        3)Open-close parenthesis
        4)Open curly brace press enter
        What are the differences between "constructors" and "methods"?
        1)Constructors do not have return type but methods must have
        2)Constructor names must be same with the class name because of that you cannot decide constructor names
          but method names can be assigned by developer.
    */



    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 20000;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(String make, String model, int year, int price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, String model, int year){

        this.make = make;
        this.model = model;
        this.year = year;

    }


}

