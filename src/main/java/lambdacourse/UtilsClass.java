package lambdacourse;

public class UtilsClass {      ///

    public static void printInTheSameLineWithASpace(Object str){  //we make is Object to make it for all Data types and make it more general

        System.out.print(str + " "); //8 9 131 10 9 10 2 8
    }

    public static boolean checkToBeEven(int x){  // we want to "CHECK" that is why it will be rerun "boolean"
        return x%2==0;
    }
    public static boolean checkToBeOdd(int x){

        return x%2!=0;
    }
    public static int getSquare(int x){      // create method for Square

        return x*x;
    }

    public static int getCube(int x){

        return x*x*x;   // create method for cube
    }
    public static char getLastChar ( String str){

        return str.charAt(str.length()-1);
    }

    public static double getHalf(int x){
        return x/2.0;
    }
    public static int getSumOfDigits (int x){  // java will receive int which will have some X (int value )

        int sum =0;

        while (x!=0 ){
            sum=sum + x%10;

            x=x/10;
        }
        return sum;
    }


}
