package day22inheritancepolymorphism;

public class Teacher {

    public static void main(String[] args) {
        add(8);
        add();

    }

    private static void add() {
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a) {
        System.out.println(a);
    }

    public void add(double a) {
        System.out.println(a);
    }
}