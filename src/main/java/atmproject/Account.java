package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber; // Create Variable Account number and Pinnumber with "Integer"data type and PRIVATE
                               // VARIABLES are CONTAINERS for STORE DATA. when we ask user info put here
    private int pinNumber; // and must be Private access
    private double checkingBalance; // checking and Saving account Variable which we need to make Data Type "double"
    private double savingBalance; //


    Scanner input = new Scanner(System.in);  // we are going to ask input from the User, that is why we need to create SCANNER this as well

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");// need to create new format for using Dollar coz we do not need to always type $0.00---
    //so we create "DecimalFormat" name as "moneyFormat" and then we're going to create == new DecimalFormat() and inside "'$'###,##0.00" each time types dollar

    ///* Encapsulation ==> Data Hiding, we make a Variable Private,but we set up PUBLIC Getter and Setter Methods to read and update them

    public int getAccountNumber(){  // Create getter Method to get data value for accountNumber Variable, and must have return type coz we want to read it

        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){ // create setter method to be able to give value to account and
        // it will be just void  need to put parameter for setter
        this.accountNumber = accountNumber; // both has same named,parameter and class name, so we use "this" keyword
    }
    public int getPinNumber (){
        return pinNumber; // later we're going to call it to read it so we need return
    }
    public void setPinNumber (int pinNumber){
        this.pinNumber= pinNumber;
    }
                        /// to create Getter and setter for next two Variables we create with "Generate" ///
                       //(right click press generate then getter&setter and choose Saving and checking balance and input)
    public double getCheckingBalance() {

        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {

        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {

        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {

        this.input = input;
    }

    // Calculate the checking balance after withdraw
    private double calculateCheckingBalanceAfterWithdraw(double amount){ // create a method with data type double because it will return money
                                                     // (we want to get money in our return)
        checkingBalance = checkingBalance - amount ; //It is very important to assign checking balance value, otherwise the value stays the same
        // this is how to assign ==> we have checkingBalance then we take money(amount) out of it = it will remain checkingBalance
        return checkingBalance;                     // and return us checkingBalance
    }
    // Calculate Checking Balance after deposit
    private double calculateCheckingBalanceAfterDeposit(double amount){ //need the parameter so user can put the amount in this parameter
        checkingBalance = checkingBalance + amount ; //
        return checkingBalance;
    }
    // Calculate the saving balance after withdraw

    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance - amount ;
        return savingBalance;
    }
    // Calculate Saving Balance after deposit
     private double calculateSavingBalanceAfterDeposit(double amount){

    savingBalance= savingBalance + amount;

        return savingBalance;
     }
     // Interact with customer to withdraw money // we do this mainly to do filtration. by putting condition
    public void getCheckingWithdraw(){ // user want to withdraw money from their acc, so we need to get them "description"

        System.out.println("Your checking balance is :" +moneyFormat.format(checkingBalance));//("description" + moneyformat we created up(variable));

        System.out.println("Enter the amount you would like to withdraw!"); // tell user

        double amount = input.nextDouble(); //create the variable to take money ex :500 but if user wants -400 is not poss,
        // so we need tp add conditions and  need to call  getCheckingWithdraw() method again, which

        if (amount <= 0){  // 500 is less than 1000 which we assume is our balance, our amount CAN NOT BE less than 0

            System.out.println("Negative or zero amount is not acceptable!");

            getCheckingWithdraw(); // call the method again to check process again in other words method will re-start

        } else if (checkingBalance >= amount) { // if the amount customer requested is more that the balance

            calculateCheckingBalanceAfterDeposit(amount); // then they can take the money

            System.out.println("This is your remaining balance:" +moneyFormat.format(checkingBalance));
                                    // give user remain balance
        }else {    // if customer wants to take more money then give below message

            System.out.println("you do not have enough money!");
        }
    }
    // interact with customer to deposit money to checking account
    public void getCheckingDeposit(){  //first create method
        System.out.println("This is your remaining balance:" +moneyFormat.format(checkingBalance));// to first give them their balance

        System.out.println("Enter the amount you would like to deposit!");

        double amount = input.nextDouble(); // need a variable for amount which data type must be double

        if (amount <= 0 ){ // they can not deposit 0 amount or minus amount
            System.out.println("Negative or Zero amount is not acceptable");

            getCheckingDeposit();

        }else {
            calculateCheckingBalanceAfterDeposit(amount); //client can put any money as deposit so we call the method
            System.out.println();
            System.out.println("Here is your remaining Balance" + moneyFormat.format(checkingBalance));
        }
    }
    // Interact with customer to withdraw from saving account
   public void getSavingWithdraw(){

       System.out.println("your saving balance is :" +moneyFormat.format(savingBalance));

       System.out.println("Enter the amount you would like to withdraw!");

       double amount = input.nextDouble(); // create double variable for amount again

       if (amount <=0){

       System.out.println("Negative or zero amount is not acceptable");// if amount is < or == 0 then give this message

           getSavingWithdraw();
       } else if (savingBalance >= amount) {

           calculateCheckingBalanceAfterWithdraw(amount);

           System.out.println("Your remaining Balance is :" + moneyFormat.format(savingBalance));

       }else {
           System.out.println("you do not have enough money!");

        // *NOTE* // if we call method getSavingWithdraw() here again it will be infinite loop
       }
   }
    // Interact with customer to deposit to their saving account

    public void getSavingDeposit(){

        System.out.println("your saving balance is :" +moneyFormat.format(savingBalance));

        System.out.println("Enter the amount you would like to deposit!");

      double amount = input.nextDouble();

      if (amount <= 0){
          System.out.println("Negative or zero amount is not acceptable");

          getSavingDeposit();

      }else {
          calculateSavingBalanceAfterDeposit(amount);
          System.out.println();
          System.out.println("your remain balance is :" + moneyFormat.format(savingBalance));
      }


    }



}
