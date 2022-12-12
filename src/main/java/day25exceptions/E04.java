package day25exceptions;

public class E04 {

    public static void main(String[] args) {
        int r1 = convertStringToInt("123");
        System.out.println(r1+1);

        int r2 = convertStringToInt("abc");
        System.out.println(r2+1);
    }
// create a method to convert a string to an integer

    public static int convertStringToInt( String str){
        int i= 0;

        try{
            i= Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());

        }
      return i;
    }
}
