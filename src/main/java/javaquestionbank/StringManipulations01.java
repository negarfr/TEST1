package javaquestionbank;

public class StringManipulations01 {

    public static void main(String[] args) {

// 1) Create a String variable for city names which have just a single word.
//Print the city name with the initial is in uppercase and all the other characters
            //are in lower cases on the console.
            //Example: mIAMI should be printed as Miami
            // miami should be printed as Miami
            // MIAMI should be printed as Miami
            // mIaMi should be printed as Miami etc.

            String cityName= "mIAMI";
            String updateCityName= cityName.trim().toLowerCase();
            updateCityName= updateCityName.substring(0,1).toLowerCase()+updateCityName.substring(1);
            System.out.println(updateCityName);

// Create 3 String variables for people's names. Print the sum of the number of characters in
//all the 3 names except space characters.
//Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String name1= "Ali Can";
        String name2= "Aliye Canan";
        String name3= "Aliye Can Cananov";
        Integer c1= name1.replaceAll("\\s"," ").length();
        Integer c2= name2.replaceAll("\\s"," ").length();
        Integer c3= name3.replaceAll("\\s", " ").length();
        System.out.println("Total number of Characters different from space:" + (c1+c2+c3));
//




    }
}
