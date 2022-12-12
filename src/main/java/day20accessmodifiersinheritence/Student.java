package day20accessmodifiersinheritence;

public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202217007";
    double stdGpa = 3.83; // if you do not type any access modifier it will be "default"
    protected String stdAddress = "Miami, FL USA";

    public static String name = "Tom Hanks";
    private static String  Id = "TH202217007";
    static  double Gpa = 3.83;
    protected static String Address = "Miami, FL USA";
/*
    1) what is the difference between "default" and "protected " access modifier ?
    i)PROTECTED access modifier is WIDER that DEFAULT modifier
    ii) DEFAULT ones cannot be used from outside the package, therefore it's other name is "package private"

    2) Please tell the name of the access modifier from the narrowest to the widest

           PRIVATE < DEFAULT < PROTECTED < PUBLIC
     3) PLease explain all access modifier




 */

}
