package day11constructorsmethodcallstatickeyword;

public class DoWhile01 {

    public static void main(String[] args) {

        //Type code to print digits just in the decimal part of the given decimal number with an asterix.
        // For example; 75.4238 ⇒ *4*2*3*8

        double num= 75.4238;

       String str= String.valueOf(num);
       String decPart =str.split("\\.")[1];
        System.out.println(decPart);

        String s= "";
        int i=0;
        do {
            String r= decPart.substring(i,i+1);

            s= s +"*"+r;

            i++;


        }while (i<decPart.length());
        System.out.println(s);










    }
}
