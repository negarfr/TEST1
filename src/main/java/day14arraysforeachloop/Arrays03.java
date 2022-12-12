package day14arraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays03 {


    public static void main(String[] args) {

        // Example1.

        String str[]= {"Ali","Tom","Carl","Agnie"};
        String name= "Carl";
        int counter= 0;
        for (String w: str){
            if (w.equals(name)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(name+"exist in array");
        }else{
            System.out.println(name + "does not exist in array");
        }
        // use Binarysearch
        Arrays.sort(str);
        int idx=Arrays.binarySearch(str, "Carl");
        System.out.println(idx);
        // . "Jim", "Tom", "Mary","Susan", "Mark" Put these names in an Array and  print them on the console.
        String str1[]={"Jim", "Tom", "Mary","Susan", "Mark"};
        System.out.println(Arrays.toString(str1));
//2. Honda, Toyota, Suzuki, Ford, Mercedes, Bmw put these in an Array and print them on the console.
        String carModels [] = {"Honda", "Toyota", "Suzuki", "Ford", "Mercedes", "Bmw"};
        System.out.println(Arrays.toString(carModels));
// 4. 58, 49, 34, 24, 28 , 14 put them in an Array and print only the first element on the console.

        int num[] = {58, 49, 34, 24, 28 , 14 };
        System.out.println(num[0]);


      //  5. Adam, Mary Kate, Berk, Hasan, Ali, Jon put them in Array and print the last element on the console.
        String Colleagues [] = { "Adam" , "Mary Kate" , "Berk", "Hassan"};
        System.out.println(Colleagues[Colleagues.length-1]);

      //  6. (12,14,24,33,38, 11, 15, 18 99) put them in an Array and  print the sum of the first and the last elements on the console.

        int numbers[] = {12,14,24,33,38,11,15,18,99};
        System.out.println(numbers[0]+ numbers[numbers.length-1]);

     //"2.1", "3.4", "5.8", "9.99", "19.99" put them in an Array and find the sum of all elements.

        double num1[]= {2.1, 3.4, 5.8, 9.99, 19.99};
        double sum = 0;

        for (double w: num1){
            sum = sum+ w;
        }
        System.out.println(sum);

        //Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen print the elements in alphabetical order on the console in different lines.

        String cars[] = {"volvo", "Audi", "Volkswagen", "Renault", "Peugeot", "Citroen "};

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

//289, 512, 11, 22, 0, 899, 99,345, 1, put them in an Array and print the elements as ascending order.

        int numberPlates [] = {289, 512, 11, 22, 0, 899, 99,345, 1};

        Arrays.sort(numberPlates);
        System.out.println(Arrays.toString(numberPlates));

        // Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen put them in an  array and print the elements before Renault.


    }

}


