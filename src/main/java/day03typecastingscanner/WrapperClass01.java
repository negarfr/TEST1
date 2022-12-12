package day03typecastingscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        int i=12;//there is no any methods

        Integer k = 13; // there are methods

        char m = 'A';

        Character d = 'A';
        //autoboxing
        byte b = 22;

        Byte wb = b;

        // Unboxing

        Short ws=34;

        short s = ws;
        //

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);

    }
}