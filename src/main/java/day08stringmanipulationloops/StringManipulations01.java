package day08stringmanipulationloops;

public class StringManipulations01 {


    public static void main(String[] args) {
        String str = "Java is easy. java is OOP.";

        String result1 = str.replaceFirst("Java", "Apex");
        System.out.println(result1);

       String result2=str.replace("Java", "Apex");
        System.out.println(result2);

        //Example1- String shirtPrice = "$12.99";
        //      String bookPrice = "$35.99";
        //      Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";
        String shirt= shirtPrice.replace("$"," ");
        String book =bookPrice.replace("$"," ");
        System.out.println(shirt + book );

        double shirtInDouble = Double.valueOf(shirt);
        double bookInDouble = Double.valueOf(book);

        System.out.println("total price is" + (shirtInDouble + bookInDouble ));

        /*
       Example 2=  swp the Integers
                    a= 12   b=23 ==> a= 23    b=12
         */
            int a= 12, b=23;
            int temp = 0;

            //1.way: We used third variable
            temp= b;
            b=a;
            a= temp;
        System.out.println(a);//23
        System.out.println(b);//12

        //2.way without using third Variable

        int x= 14, y=25;
        y= y - x;
        x= y + x;
        y= x - y;

        System.out.println(x);
        System.out.println(y);





    }


}
