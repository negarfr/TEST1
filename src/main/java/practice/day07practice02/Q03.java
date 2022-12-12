package practice.day07practice02;

public class Q03 {

      /*
       String shirtPrice= "$ 12.99";
       String bookPrice= "$ 35.99";

       Type a code to find the sum of the shirt and book prices.

     */
      public static void main(String[] args) {

          String shirtPrice = "$ 12.99";
          String bookPrice = "$ 35.99";

          String shirt = shirtPrice.replace("$" , "");
          String book = bookPrice.replace("$", "");


          double sd= Double.valueOf(shirt);
          double bd= Double.valueOf(book);

          System.out.println(sd+bd);
          ;
      }

}
