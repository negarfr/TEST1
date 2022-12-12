package day23_paracticesession;

public class Question01_SumOfFirstIntWithNums {

    /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */

    public static void main(String[] args) {
    myMethod(7,4,6,-7,100);
    myMethod(0,1111,54);
    myMethod(-1, 5,7,200);
    myMethod(2.4, 2,3,6);
    myMethod(2.4, 1.1,2.3,3,4);
    myMethod(3.4,5.2,9.8,4.6);
    }
    public static void myMethod(int a, int...numbers){
        int sum = 0;

        for (int w:numbers){
            sum+=w;// different way of typing sum = sum+w ; sum will be increase by "w" value
        }
        System.out.println(a*sum);
    }
    public static void myMethod (double a,int...numbers){
        double sum = 0;

        for (int w:numbers){
            sum+=w;// different way of typing sum = sum+w ; sum will be increase by "w" value
        }
        System.out.println(a*sum);
    }
    public static void myMethod (double a, double...numbers){
        double sum = 0;

        for (double w:numbers){
            sum+=w;// different way of typing sum = sum+w ; sum will be increase by "w" value
        }
        System.out.println(a*sum);
    }
}