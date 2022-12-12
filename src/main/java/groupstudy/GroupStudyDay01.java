package groupstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GroupStudyDay01 {

    public static void main(String[] args) {

        /* - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.

  */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.println("Enter the number of elements");
        int size = input.nextInt();

        for(int i=0; i<size; i++){
            System.out.println("Enter the number to add the list");
            num.add(input.nextInt());
        }
        System.out.println(num);

        //ii)

        System.out.println("Enter the element to remove");
        int removed = input.nextInt();
        num.remove(num.indexOf(removed));
        System.out.println(num);
        //iii)

        System.out.println("Enter the index to update");   //set() (starting inx, updated element)
        int idx = input.nextInt(); //2   idx = 2
        System.out.println("uptaded");//77
        int updated = input.nextInt(); // updated = 77

        num.set(num.indexOf(idx), updated);
        System.out.println(num);
    }

}






