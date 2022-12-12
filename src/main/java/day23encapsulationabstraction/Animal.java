package day23encapsulationabstraction;

/*
    1)Sometimes no child uses the implementation from the parent class, therefore
      the body part of the method in parent class is being unusable.
      If something is unusable we do not want to type it.
      If you do not type the body of a method, you will have "method without body"(Like angels),
      it is called "Abstract Method"

    2)"Concrete Methods"(Methods with body) focus on 2 things; i)What to do ii)How to do
      "Abstract Methods" focus on just "What to do"

    3)If you make a method "abstract", it will be mandatory to override for all child classes
 */

public abstract class Animal {
    public abstract void eat();

    public abstract void drink();




}
