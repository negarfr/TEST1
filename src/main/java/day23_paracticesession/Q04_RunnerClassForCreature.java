package day23_paracticesession;

public class Q04_RunnerClassForCreature {

    public static void main(String[] args) {

        Q04_Cat cat1= new Q04_Cat();

        cat1.eat();
        cat1.drink();
        cat1.move();

        Q04_Bird bird = new Q04_Bird();
        bird.move();
        bird.weight();
    }
}
