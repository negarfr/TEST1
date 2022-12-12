package day05ternarystringmanipulations;

public class Ternary01 {

    public static void main(String[] args) {
        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        int i = 12;

//1.Way:
        if(i>0){
            System.out.println("The integer is positive");
        }else{
            System.out.println("The integer is not positive");
        }

//2.Way:ternary
        //Condition     ?       Will be selected for true condition      :    Will be selected for false condition
        String result = i>0         ?           "The integer is positive"            :        "The integer is not positive";
        System.out.println(result);

        // type a program to print the minimum of 2 integers on the console. use  ternary
        // 12,23==> 12       345, 23 ==> 23     -12, -3 ==> -12

        double d= -1.2, e= -2.3;

        double min= d>e ? e : d;

        System.out.println("min");

        double f= 0;

              double abs = f>=0 ? f : -1*f;
        System.out.println(abs);

    }

}
