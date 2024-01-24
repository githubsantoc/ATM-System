package atmInterface;
import java.util.Scanner;
import static atmInterface.ATMSystem.menu;
import static atmInterface.ATMSystem.balance;
public class Deposit {

    public static void depositMoney(){
        System.out.println("Enter the amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
        menu();
    }
}
