package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {  // we want to get all Variables and Methods from other class
                                        // we need to use inheritance == extends this class to other one
    Scanner input = new Scanner(System.in); // get data from user
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00"); // same object to initialize the object in our class
                                                            //Initializing an object means storing data into the object.

    // create hashmap to get pin number and account number and they both are < Integer , Integer >

    Map<Integer, Integer> data = new HashMap<>(); // we store our data into the MAP

    boolean flag = true; // we going to put some flags here


   public void login(){

       System.out.println("Hello, Welcome to Techpro ATM...");

       int counter = 0;

       do {
           data.put(12345, 1234);
           data.put(23456, 2345);
           data.put(34567, 3456);
           data.put(45678, 4567);

           try{

               System.out.println("Enter the account number");
               setAccountNumber(input.nextInt());
               System.out.println("Enter the pin number  ");
               setPinNumber(input.nextInt());

           }catch (Exception e) {

               System.out.println("you have entered an invalid character(s)! ");

               System.out.println("Please select an integer or press 'q' to exit the system ");

               String exit = input.next();

               if (exit.equalsIgnoreCase("q")) {
                   flag = false;
                   break;
               }
               e.printStackTrace();
           }
           int count = 0;
           for(Map.Entry<Integer, Integer> w : data.entrySet()){

               if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){

                getAccountTypes();

               }else {
                   count++;
               }
           }

        if(count == data.size()){
            counter++;
            System.out.println("Account number or pin in invalid ");
            System.out.println(" please select and integer or press q to exit");
            String exit = input.next();
            if (exit.equalsIgnoreCase("q")){
                flag = false ;

            }
        }
    if (counter == 3){
        System.out.println(" your account has been blocked!");
        flag = false;
    }


       }while(flag);

   }                                  // need to create an Operation for user ( means what exactly user wants )
   // start operation with checking
    public void checkingOperations() {

        do {
            optionsDisplay(); // create this method at the very bottom to prevent recreation coding

            int option = input.nextInt(); // take the input from the user

            if (option == 4) { // we're getting option from user here so we need to give it conditions
                break;          // this is for Exit the system
            }
            switch (option) {
                case 1:
                    System.out.println("Your checking balance is: " + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw(); // already have this method so we put it
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default: // need to alert user with default and bellow message
                    System.out.println("Invalid option! Please select 1, 2, 3 or 4");
            }
        } while (true);

        getAccountTypes();
    }

    // get Saving Operations
    public void savingOperations() {

        do {
            optionsDisplay(); // we create this method below to make our code "dynamic" and avoid duplication
                                // which means we do not need to type all sout()
            int option = input.nextInt();

            if (option == 4) {
                break; // option 4 is Exit the system so we put Break;
            }

            switch (option) {
                case 1:
                    System.out.println("Your checking Balance is:" + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Invalid option! Please select 1, 2, 3 or 4");
            }

        } while (true);

        getAccountTypes();  // by calling this method we created at the bottom we let Customer stay and do more options

    }

    // we create the options, BUT before that our user need to select the account
    public void getAccountTypes() { // to create account type to tell user which account we want to work with

        System.out.println("Select the account you would like to access!");
        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Quit");

        int option = input.nextInt(); // asking user to give us option

        switch (option) { // conditions in our options

            case 1:
                System.out.println(" you are in your Checking Account");
                checkingOperations(); // when they are in our checking account they need to call for checkingOperation
                break;
            case 2:
                System.out.println(" you are in your Saving Account");
                savingOperations();//when they are in our saving account they need to call for savingOperation
                break;
            case 3:
                System.out.println("Thanks for choosing the ATM! See you later");// this case we give nice message coz they Exit

                flag = false;  // our boolean was True to exit the system we put flap false
                break;
            default:
                System.out.println("Invalid option! Please select 1,2,3 ");
        }
    }

    public void optionsDisplay() { // create this to prevent retype the codes again

        System.out.println("Select Options");// telling user to select options

        System.out.println("1 : View Account");// option 1 we tell them to "view Balance"
        System.out.println("2 : Withdraw ");// Option2 withdraw money
        System.out.println("3 : Deposit");// option 3 deposit money
        System.out.println("4: Exit ");

    }
}