package ATM_Machine_Project;

import java.util.Scanner;

public class ATM_Machine {

    // creating method for checking the pin
    public static void check_Pin(){
        int pin = 2712;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 4 digit pin");
        int Pin = input.nextInt();
        if (pin == Pin) {
            ATM.Menu();
        } else {
            System.out.println("Your entered pin was incorrect");
            System.out.println("Enter Correct Pin");
            check_Pin();
        }
    }
    public static void main(String[] args){

        check_Pin();

    }

    // creating class for all methods
    static class ATM{
        static double Account_balance = 10000;

        // creating method for menu and all operations
        public  static void Menu(){


            System.out.println("Enter your choice.");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            Scanner input = new Scanner(System.in);
            int option = input.nextInt();

            if(option == 1){
                ATM.check_Balance();
                Menu();
            }
            else if(option == 2){
                ATM.withdraw_Money();
                Menu();
            }
            else if(option == 3){
                ATM.deposit_Money();
                Menu();
            }
            else if(option == 4){
                ATM.Exit();

            }
            else{
                System.out.println("Enter valid choice");
            }
        }

        // creating method for check balance
        public static void check_Balance(){
            System.out.println("Your Account Balance is : " + Account_balance);
        }

        // creating method for withdraw money
        public static void withdraw_Money(){
            System.out.println("Enter amount to withdraw.");
            Scanner input = new Scanner(System.in);
            double debit_Amount = input.nextDouble();
            if(debit_Amount > Account_balance){
                System.out.println("Sorry you have insufficient amount ");
            }
            else{
                System.out.println("Your withdrawn amount is: " + debit_Amount);
                Account_balance = Account_balance - debit_Amount;
            }
        }

        // creating deposit money method
        public static void deposit_Money(){
            System.out.println("Enter your Amount to deposit");
            Scanner input = new Scanner(System.in);
            double credit_Amount = input.nextDouble();

            if(credit_Amount <= 1000){
                System.out.println("Invalid Amount, Please deposit amount >= 10000");
            }
            else{

                System.out.println("Your deposit was successful. " );
                System.out.println("You can check balance or exit.");
                Account_balance = Account_balance + credit_Amount;
            }
        }

        // creating exit method
        public static void Exit(){
            System.out.println("Thank you for using our ATM Service.");
            System.out.println("Please Come-back later");
        }
    }
}
