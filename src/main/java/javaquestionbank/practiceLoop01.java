package javaquestionbank;

public class practiceLoop01 {

    public static void main(String[] args) {
        //Type code to print repeated characters in a String. For example; accessories ⇒ ces
        //String s= "accessories";

      String s= "accessories";

      String d= "";
      int i= 0;
      do {
          String c= s.substring(i,i+1);

          if (s.indexOf(c)!=s.lastIndexOf(c)){
              if (!d.contains(c)){

                  d= d+c;

              }
          }

          i++;
      }while(i<s.length());
        System.out.println(d);

        // Type code to check whether a String is palindrome or not. If a String is the same with its
        // reverse then it is called palindrome. For example; “anna”, “123321” are palindromes



    }

}

