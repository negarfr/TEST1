package day20accessmodifiersinheritence;

public class Runner {

    public static void main(String[] args) {

        Student std1 = new Student();
        System.out.println(std1.stdName);

        Student std2 = new Student();
        System.out.println(std2.stdGpa);

        Student std3 = new Student();
        System.out.println(std3.stdAddress);

        System.out.println(Student.Address);


    }
}
