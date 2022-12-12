package day15multidimensionalarray;

public class MultidimensionalArrays04 {

    public static void main(String[] args) {

        //example1 : find the maximum element in two-dimensionals array
        // { {5, 0}, {-2, 4}, {65, -12, 23} }

        int arr [][]=  { {5, 0}, {-2, 4}, {65, -12, 23} };

        int max= arr[0][0];
        for (int[] w: arr){

            for (int u:w){
                if(max<u){
                    max= u;
                }
            }
        }
        System.out.println(max);


    }
}
