import java.util.Scanner;

public class BankAccount {

    private String password;
    private double balance;

    public static final int OVERDRAFT_LIMIT = 100;

    public BankAccount(String password, Double balance) {
        this.password = password;
        this.balance = balance;
    }

    public void depositBank() {
        Scanner input = new Scanner(System.in);
        Double amount = 0.00;
        System.out.println("How much would you like to deposit?");
        while (true) {
            try {
                amount = Double.parseDouble(input.next());
                if (amount < 0) {
                    throw new Exception();
                }
                else {
                    balance = balance + amount;
                    System.out.println("New balance: " + balance);
                    break;
                }
            }
            catch (NumberFormatException ignore) {
                System.out.println("Invalid amount. Please try again.");
            }
            catch (Exception ignore) {
                System.out.println("Invalid amount. Please try again.");
            }
        }
        System.out.println("What else would you like to do? (deposit, withdraw, transfer, exit)");
        String action = input.next();
        if (action.equals("deposit")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositBank();
                    }
                }
                else {
                    depositBank();
                }
            }
            else {
                depositBank();
            }
        }
        if (action.equals("withdraw")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositWithdraw();
                    }
                }
                else {
                    depositWithdraw();
                }
            }
            else {
                depositWithdraw();
            }
        }
        if (action.equals("transfer")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositTransfer();
                    }
                }
                else {
                    depositTransfer();
                }
            }
            else {
                depositTransfer();
            }
        }

        while (!action.equals("deposit") && !action.equals("withdraw") && !action.equals("transfer") && !action.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            action = input.next();
            if (action.equals("deposit")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositBank();
                        }
                    }
                    else {
                        depositBank();
                    }
                }
                else {
                    depositBank();
                }
            }
            if (action.equals("withdraw")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositWithdraw();
                        }
                    }
                    else {
                        depositWithdraw();
                    }
                }
                else {
                    depositWithdraw();
                }
            }
            if (action.equals("transfer")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositTransfer();
                        }
                    }
                    else {
                        depositTransfer();
                    }
                }
                else {
                    depositTransfer();
                }
            }
        }
    }

    public void depositWithdraw() {
        Scanner input = new Scanner(System.in);
        Double amount = 0.00;
        System.out.println("How much would you like to withdraw?");
        while (true) {
            try {
                amount = Double.parseDouble(input.next());
                if (amount < 0 || balance + OVERDRAFT_LIMIT - amount < 0) {
                    throw new Exception();
                }
                else {
                    balance = balance - amount;
                    System.out.println("New balance: " + balance);
                }
                break;
            }
            catch (NumberFormatException ignore) {
                System.out.println("Invalid amount. Please try again.");
            }
            catch (Exception ignore) {
                System.out.println("Invalid amount. Please try again.");
            }
        }
        System.out.println("What else would you like to do? (deposit, withdraw, transfer, exit)");
        String action = input.next();
        if (action.equals("deposit")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositBank();
                    }
                }
                else {
                    depositBank();
                }
            }
            else {
                depositBank();
            }
        }
        if (action.equals("withdraw")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositWithdraw();
                    }
                }
                else {
                    depositWithdraw();
                }
            }
            else {
                depositWithdraw();
            }
        }
        if (action.equals("transfer")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositTransfer();
                    }
                }
                else {
                    depositTransfer();
                }
            }
            else {
                depositTransfer();
            }
        }

        while (!action.equals("deposit") && !action.equals("withdraw") && !action.equals("transfer") && !action.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            action = input.next();
            if (action.equals("deposit")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositBank();
                        }
                    }
                    else {
                        depositBank();
                    }
                }
                else {
                    depositBank();
                }
            }
            if (action.equals("withdraw")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositWithdraw();
                        }
                    }
                    else {
                        depositWithdraw();
                    }
                }
                else {
                    depositWithdraw();
                }
            }
            if (action.equals("transfer")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositTransfer();
                        }
                    }
                    else {
                        depositTransfer();
                    }
                }
                else {
                    depositTransfer();
                }
            }
        }
    }

    public void depositTransfer() {
        Scanner input = new Scanner(System.in);
        Double amount = 0.00;
        System.out.println("From what account? (for this example, there is only user)");
        String action = input.next();
        if (action.equals("user")) {
            System.out.println("How much would you like to transfer?");
            while (true) {
                try {
                    amount = Double.parseDouble(input.next());
                    if (amount < 0 || balance + OVERDRAFT_LIMIT - amount < 0) {
                        throw new Exception();
                    }
                    else {
                        balance = balance - amount;
                        System.out.println("New balance: " + balance);
                    }
                    break;
                }
                catch (NumberFormatException ignore) {
                    System.out.println("Invalid amount. Please try again.");
                }
                catch (Exception ignore) {
                    System.out.println("Invalid amount. Please try again.");
                }
            }
        }
        System.out.println("What else would you like to do? (deposit, withdraw, transfer, exit)");
        action = input.next();
        if (action.equals("deposit")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositBank();
                    }
                }
                else {
                    depositBank();
                }
            }
            else {
                depositBank();
            }
        }
        if (action.equals("withdraw")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositWithdraw();
                    }
                }
                else {
                    depositWithdraw();
                }
            }
            else {
                depositWithdraw();
            }
        }
        if (action.equals("transfer")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        depositTransfer();
                    }
                }
                else {
                    depositTransfer();
                }
            }
            else {
                depositTransfer();
            }
        }

        while (!action.equals("deposit") && !action.equals("withdraw") && !action.equals("transfer") && !action.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            action = input.next();
            if (action.equals("deposit")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositBank();
                        }
                    }
                    else {
                        depositBank();
                    }
                }
                else {
                    depositBank();
                }
            }
            if (action.equals("withdraw")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositWithdraw();
                        }
                    }
                    else {
                        depositWithdraw();
                    }
                }
                else {
                    depositWithdraw();
                }
            }
            if (action.equals("transfer")) {
                System.out.println("Please enter password: ");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. Two more attempts remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. One more attempt remaining.");
                        if (!input.next().equals(password)) {
                            System.out.println("Wrong password. Your account has been locked.");
                            System.exit(0);
                        }
                        else {
                            depositTransfer();
                        }
                    }
                    else {
                        depositTransfer();
                    }
                }
                else {
                    depositTransfer();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String password = input.next();
        System.out.print("Enter balance: ");
        Double balance = input.nextDouble();
        BankAccount user = new BankAccount(password, balance);
        BankAccount admin = new BankAccount("admin", 100000.00);

        System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
        String action = input.next();

        while (!action.equals("deposit") && !action.equals("withdraw") && !action.equals("transfer") && !action.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            action = input.next();
        }

        if (action.equals("deposit")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        user.depositBank();
                    }
                }
                else {
                    user.depositBank();
                }
            }
            else {
                user.depositBank();
            }
        }

        if (action.equals("withdraw")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        user.depositWithdraw();
                    }
                }
                else {
                    user.depositWithdraw();
                }
            }
            else {
                user.depositWithdraw();
            }
        }

        if (action.equals("transfer")) {
            System.out.println("Please enter password: ");
            if (!input.next().equals(password)) {
                System.out.println("Wrong password. Two more attempts remaining.");
                if (!input.next().equals(password)) {
                    System.out.println("Wrong password. One more attempt remaining.");
                    if (!input.next().equals(password)) {
                        System.out.println("Wrong password. Your account has been locked.");
                        System.exit(0);
                    }
                    else {
                        user.depositTransfer();
                    }
                }
                else {
                    user.depositTransfer();
                }
            }
            else {
                user.depositTransfer();
            }
        }
    }
}
