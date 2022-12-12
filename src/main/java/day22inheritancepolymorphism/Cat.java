package day22inheritancepolymorphism;

public class Cat extends Mammal {

   public String name = "cat";

   public Cat(){

      System.out.println(name);
      System.out.println(super.name);

   }

   @Override
   public void eat() {
      System.out.println("Cats eat...");
   }

   @Override
   public void drink() {
      System.out.println("Cats drink milk...");
   }

   @Override
   public Animal create() {
      return new Mammal();
   }

   @Override
   public Integer add() {
      return 12;
   }


}
