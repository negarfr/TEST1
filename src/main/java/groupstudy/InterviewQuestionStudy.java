package groupstudy;

import java.util.Arrays;

public class InterviewQuestionStudy {

    public static void main(String[] args) {
        //1) [0,2,3,0,12,0] put the zeros to the end.
        //output ==> [2,3,12,0,0,0]

       int [] arr = new int []{0,2,3,0,12,0};

       int [] brr= new int [arr.length];
        System.out.println(Arrays.toString(brr));// [null, null, null, null, null, null]// to get emty Array lemght
        int firstIdx = 0;

        int lastInd = arr.length-1; // get array length

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=0) {  // if i Value in arr Array is not 0
                brr[firstIdx] = arr[i]; // then that value which is not 0 goes to first index in Array brr

                firstIdx ++; // increase the value in firstInd and execude the code again
            }else {
                brr[lastInd]=0; // otherwise value in last index in brr will be 0

                lastInd --;
            }
        }
        System.out.println(Arrays.toString(brr)); //[2,3,12,0,0,0]


    // 2. What is the difference between methods and constructors?
        /*  constructor==>  - It is "CODE BLOCK" used to create objects from a class.
                            - when we create a class Java creates a "default constructor" inside the class.
                            - That is why we can create an object in every class without creating any constructor.
            public class MyClass {
                    MyClass() {      <======= 1- constructor is inside the class
                      }                       2- Has the same name as class
                     }                        3- constructor has NO "return type" BUT "Methods" has rerun Type

            Method ===> - A method is a block of code which only runs when it is called.
                        - Method describes behavior of an object.
                        - A method is a collection of statements that are grouped together to perform an operation.

           Differences :

   1- A Constructor are used to create object .	A Method is invoked through method calls.
   2- A Constructor does not  have a return type.	A Method must have a return type.
   3- A Constructor initializes an object that doesn’t exist.	A Method does operations on an already created object.
   4- A Constructor’s name must be same as the name of the class.	A Method’s name can be anything.
   5- A Constructor cannot be inherited by subclasses.	A Method can be inherited by subclasses.
         */

      //3- Type code to reverse a string.  Tom Hanks==> sknaH moT

        String str = "Tom Hanks";

        String reversed = " ";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed= reversed+str.charAt(i);
        }
        System.out.println(reversed);

        // 4-//Ask user to enter 2 numbers  then swap them
        //// a = 12; and b= 13; ==> a=13; and b=12;

    }
}