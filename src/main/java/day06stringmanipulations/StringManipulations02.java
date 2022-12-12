package day06stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Type code to see the order number of the first occurrence of the character 'a'
//            "I want to learn Java"

        String str = "I want to learn Java";
       int idx = str.indexOf('a'); //indexOf()
        System.out.println(idx + 1);

        //Example 2: Type code to see the order number of the first occurrence of "Java"
//            "I like to study Java, learn Java, earn money, Java is easy."

        String s = "I like to study Java, learn Java, earn money, Java is easy.";
        int i = s.indexOf("Java");
        System.out.println(i+1);
// Note 1: Index of method can be used with "char" and "String" data types like str.indexOf('a') and
// like s.indexOf("Java");
        //Note 2: If you use String inside the indexOf(), it will return the index of the first character. s.indexOf("Java"); returns the index of "J"
//Note 3: s.indexOf("xyz"); ==> -1   indexOf() method returns "-1" for non-existing characters

        int t = s.indexOf('w');
        System.out.println(t);// -1

        //Example 3: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios

        String word = "I like to study";

        if (word.indexOf('a')== -1){
            System.out.println("there is no 'a'");

        }else {
            System.out.println("There is 's'");
        }
        //2.way : Ternary

        String result = word.indexOf('a')== -1 ? "there is no 'a'" :"There is 's'";
        System.out.println(result);


        String r = " I like to study java, Learn Java, Earn money, Java is easy";
        int f= r.lastIndexOf("Java");
        System.out.println(f);

// Example 5: Type code to check if a character is unique in a String or not
        // "Hello" ==> H is unique, e is Unique , o is unique

        String m = "Hello";

//1.Way:
        if(m.indexOf('l')==-1){
            System.out.println("The character does not exist");
        } else if(m.indexOf('l')==m.lastIndexOf('l')){
            System.out.println("The character is unique");
        }else{
            System.out.println("The character is not unique");
        }

        //2.Way:Nested Ternary

        String res = m.indexOf('l')==-1 ? "The character does not exist" : (m.indexOf('l')==m.lastIndexOf('l') ? "The character is unique" : "The character is not unique");
        System.out.println(res);

    }
}