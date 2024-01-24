package atmInterface;

import java.util.Scanner;

public class ATMSystem {
    final int PIN = 1234;
    static double balance = 0;

    static Scanner sc = new Scanner(System.in);

    public void checkPIN(){
        System.out.println("Enter your pin");
        int pinEntered = sc.nextInt();
        if( pinEntered == PIN){
            menu();
        } else{
            System.out.println("Please, enter the valid pin");
        }
    }

    public static void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1. Check Balance Account");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Transfer");
        System.out.println("5. EXIT");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                CheckBalance.checkBalance();
                break;
            case 2:
                Withdraw.withdrawMoney();
                break;
            case 3:
                Deposit.depositMoney();
                break;
            case 4:
                Transfer.transferMoney();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }
}
