package day20accessmodifiersinheritence;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat c= new Cat();

        c.eat();
        c.drink();
        c.meow();
        // create a dog object and see which method you can use

        Dog d= new Dog();
        d.eat();
        d.bark();
        d.drink();

        Bird b = new Bird();
        b.eat();
        b.drink();
        b.tweet();


    }
}
