package day19stringbuilder;

public class StringBuilder02 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Mississippi");
        System.out.println(sb1);
    // toString() method is used to change StringBuilders to Strings
        sb1.toString();
        System.out.println(sb1);

        String test = sb1.toString();
        System.out.println(test);


        StringBuilder revSb1 = sb1.reverse();
        System.out.println(revSb1 );

        //deleteCharAt() is used to delete a Charactor at a specific index

        sb1.deleteCharAt(0);
        System.out.println(sb1);


        sb1.delete(2,5);
        System.out.println(sb1);
        sb1.replace(2,4,"IS");
        System.out.println(sb1);

        sb1.insert(3, "xxx");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java is love");
        StringBuilder sb3 = new StringBuilder("Java is Love");

        int result= sb2.compareTo(sb3);
        System.out.println(result);

        sb3.setCharAt(8, 'm');
        System.out.println(sb3);


    }
}
