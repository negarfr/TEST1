package day25exceptions;

public class E05 {

    public static void main(String[] args) {

       char r1= getCharFromString("Java", 9);
        System.out.println(r1);//StringIndexOutOfBoundsException ; If you use non exciting
        // index for a string

    }

    // create a method to get any character from a String
    public static char getCharFromString(String str, int idx){

        char s= 0;
    try{
       s = str.charAt(idx);
    }catch (StringIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
       return s;
    }
}
