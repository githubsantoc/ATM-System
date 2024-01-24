package atmInterface;

import static atmInterface.ATMSystem.balance;
import static atmInterface.ATMSystem.menu;

public class CheckBalance {

    public static void checkBalance(){
        System.out.println("Your balance is "+ balance);
        menu();
    }
}
