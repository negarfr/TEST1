package day01variables;

public class VariablesAndMethods {

    public static void main(String[] args) {

      burp(); // calling the method we created here by its name

     printName(" " + "Negar France "); // passing the Value which means by putting data in parantes when we call our method

        String fullName = fullName("Negar France " , 47 ); // calling the string method we created

        String myFullName = "Negar France"; // This is our V
       myFullName.contains("F");    // contains() is a method
        System.out.println( myFullName.contains("F"));
       myFullName.length();     // length() is a method and so on and on rest of them
        System.out.println( myFullName.length());

    }
    // we can also create our own Method

   private static void burp()   {

   System.out.println("Buuuurrrp!");//NOTHING will print here so we MUST call this by using its name in main Method

   }

   private static void printName (String name){ // Method also can be created with Parameters
       System.out.println("My name is" + name); //
   }

   private static String fullName ( String fName , int number ){ // we want method "return" string,

     return " My full name is " + 47 ;
   }
}
