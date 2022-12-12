package day19stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        // what is StringBuilder Class ?
        // is for creating Mutable String
        //whenever you want to create a String you can use this class.

        // We use "String class to create a String. why and when we will need "StringBuilder class"?
        //"String class" is "immutable" , "StringBuilder class is "mutable"

        // String class is " immutable" means it does not change the existing Value.
        // if you want to assign a new value to a variable, Java will create a new container inside the "String pool"
        // then will put new value in it, then changes the address pointer to the new container.
        String name = "Tom";
        name = "Mark";
        // if any container does not have any address pointer, "garbage collector" removes the container from the memory.

        String s = "John";
        String r = "John";
        r= "sam";
        // I want a separate container whose value is Jhon

        StringBuilder sb= new StringBuilder("Clara");
        sb= new StringBuilder("Jim");

        // How to create a StringBuilder Object
        //1.way
        StringBuilder sb1= new StringBuilder("Clara");
        System.out.println(sb1);
        //2.way
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Clara");
        sb2.append("Ocean");
        System.out.println(sb2);
            sb2.append("Marry ").append("Negar ").append("Arcilla ");
        System.out.println(sb2);

        StringBuilder sb3= new StringBuilder();

        sb3.append("Mexico");
        sb3.append("Jackson");

        int numOfChar = sb3.length();
        System.out.println(numOfChar);

        int cap = sb3.capacity();
        System.out.println(cap);




    }
}
