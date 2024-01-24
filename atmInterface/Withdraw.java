package atmInterface;

import java.util.Scanner;
import static atmInterface.ATMSystem.balance;
import static atmInterface.ATMSystem.menu;

public class Withdraw {

    public static void withdrawMoney() {
        System.out.println("Enter the amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        if(balance < amount ){
            System.out.println("You have insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Balance Withdrawn Successfully");
        }
        menu();
    }
}


