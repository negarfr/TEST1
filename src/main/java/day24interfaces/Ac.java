package day24interfaces;

public interface Ac extends BigAc{

    public void digital();

    void price ();

   public int price = 2300;

   String name = "Perfect AC";

   public  default int calculate(){
       return 1200;
   }

public static boolean climate(){
       return true;
}



}
