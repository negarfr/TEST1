package day23_paracticesession;

public class Q02SymetricalArray {

    // type a method to check if an int Array is Symmetrical or not.

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 3, 2, 1};
        System.out.println("if an int Array is Symmetrical ?" + symmetrical(arr));
    }

    public static boolean symmetrical(int[] arr) {
        boolean result = false;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[arr.length - 1 - i]) {
                result = true;
            } else {
                result = false;
                break;
            }

        }

        return result;
    }
}