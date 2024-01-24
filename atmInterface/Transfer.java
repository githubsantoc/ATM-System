package atmInterface;

import java.util.Scanner;
import static atmInterface.ATMSystem.balance;
import static atmInterface.ATMSystem.menu;

public class Transfer {
    static Scanner sc = new Scanner(System.in);
    public static void transferMoney(){
        System.out.println("Enter the recipient account number: ");
        int accountNumber = sc.nextInt();
        System.out.println("Enter the balance to transfer : ");
        double amount = sc.nextDouble();
        if (amount > balance){
            System.out.println("Transfer Unsuccessful. You do not have sufficient balance");
            menu();
        } else {
            balance -= amount;
            System.out.println("You have transferred $" + amount +" to account number "+ accountNumber);
            CheckBalance.checkBalance();
        }


    }
}
