package day22inheritancepolymorphism;

public class Animal {

    public String name = "Animal";

    public void eat(){
        System.out.println("Animal Eat..");

    }
    public void drink(){
        System.out.println("Animal drink...");
    }

        public Animal create(){
        return new Mammal();
}

  public Integer add(){
        return 12;
  }

  public  final int divide (){
        return 34;
  }


}
