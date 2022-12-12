package day18_passbyvalue;

public class Increment_Decrement {

    public static void main(String[] args) {

        int a= 12;
               int b = a  ++;
        System.out.println(b);
        System.out.println(a);

        int x= 15;
        int y = x--;
        System.out.println(x);
        System.out.println(y);

        int m= 21;
        int n= ++m;
        System.out.println(m);
        System.out.println(n);

        int t= 32;
        int s= --t;
        System.out.println(t);
        System.out.println(s);

    }

}
