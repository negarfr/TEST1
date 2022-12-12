package day23encapsulationabstraction;

public class StudentRunner {


    public static void main(String[] args) {

        Student std1 = new Student();

        System.out.println(std1.name);

        System.out.println(std1.getStdId());

    std1.getDisease();
        System.out.println(std1.getDisease());

        std1.getStdGpa();

        System.out.println(std1.getStdGpa());
    }
}
