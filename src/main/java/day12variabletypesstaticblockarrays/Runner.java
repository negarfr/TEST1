package day12variabletypesstaticblockarrays;

public class Runner {

    public static void main(String[] args) {

        VariableTypes01 obj = new VariableTypes01();

        System.out.println(obj.name);

        System.out.println(VariableTypes01.age);

        System.out.println(obj.add(3,5));;

        System.out.println(obj.multiply(3, 5));
    }
}
