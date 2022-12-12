package day24interfaces;

public class CarRunner {

    public static void main(String[] args) {

        System.out.println(Ac.price);

        System.out.println(Brake.price);
        System.out.println(Engine.price);

        System.out.println(Brake.luxury);
        System.out.println(Ac.name);

        Honda h = new Honda();

        System.out.println(Ac.climate());
        System.out.println(h.calculate());
    }
}
