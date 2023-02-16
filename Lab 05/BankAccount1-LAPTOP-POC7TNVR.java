import java.util.Scanner;

public class BankAccount1 {

    private String password;
    private double balance;

    public static final int OVERDRAFT_LIMIT = 100;

    public BankAccount1(String password, Double balance) {
        this.password = password;
        this.balance = balance;
    }

    public void depositBank() {
        Scanner newInput = new Scanner(System.in);
        Double amount = 0.00;
        System.out.println("How much would you like to deposit?");
        while (true) {
            try {
                amount = Double.parseDouble(newInput.next());
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
        String newAction = newInput.next();
        if (newAction.equals("deposit")) {
            depositBank();
        }
        if (newAction.equals("withdraw")) {
            depositWithdraw();
        }
        if (newAction.equals("transfer")) {
            depositTransfer();
        }

        while (!newAction.equals("deposit") && !newAction.equals("withdraw") && !newAction.equals("transfer") && !newAction.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            newAction = newInput.next();
            if (newAction.equals("deposit")) {
                depositBank();
            }
            if (newAction.equals("withdraw")) {
                depositWithdraw();
            }
            if (newAction.equals("transfer")) {
                depositTransfer();
            }
        }
    }

    public void depositWithdraw() {
        Scanner newInput = new Scanner(System.in);
        Double amount = 0.00;
        System.out.println("How much would you like to withdraw?");
        while (true) {
            try {
                amount = Double.parseDouble(newInput.next());
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
        String newAction = newInput.next();
        if (newAction.equals("deposit")) {
            depositBank();
        }
        if (newAction.equals("withdraw")) {
            depositWithdraw();
        }
        if (newAction.equals("transfer")) {
            depositTransfer();
        }

        while (!newAction.equals("deposit") && !newAction.equals("withdraw") && !newAction.equals("transfer") && !newAction.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            newAction = newInput.next();
            if (newAction.equals("deposit")) {
                depositBank();
            }
            if (newAction.equals("withdraw")) {
                depositWithdraw();
            }
            if (newAction.equals("transfer")) {
                depositTransfer();
            }
        }
    }

    public void depositTransfer() {
        Scanner newInput = new Scanner(System.in);
        Double amount = 0.00;
        System.out.println("From what account? (for this example, there is only user)");
        String action = newInput.next();
        if (action.equals("user")) {
            System.out.println("How much would you like to transfer?");
            while (true) {
                try {
                    amount = Double.parseDouble(newInput.next());
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
        action = newInput.next();
        if (action.equals("deposit")) {
            depositBank();
        }
        if (action.equals("withdraw")) {
            depositWithdraw();
        }
        if (action.equals("transfer")) {
            depositTransfer();
        }

        while (!action.equals("deposit") && !action.equals("withdraw") && !action.equals("transfer") && !action.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            action = newInput.next();
            if (action.equals("deposit")) {
                depositBank();
            }
            if (action.equals("withdraw")) {
                depositWithdraw();
            }
            if (action.equals("transfer")) {
                depositTransfer();
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new password: ");
        String password = input.next();
        System.out.print("Enter balance: ");
        Double balance = input.nextDouble();
        BankAccount2 user = new BankAccount2(password, balance);
        BankAccount2 admin = new BankAccount2("admin", 100000.00);

        System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
        String action = input.next();

        while (!action.equals("deposit") && !action.equals("withdraw") && !action.equals("transfer") && !action.equals("exit")) {
            System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
            action = input.next();
        }

        if (action.equals("deposit")) {
            Scanner newInput = new Scanner(System.in);
            Double amount = 0.00;
            System.out.println("How much would you like to deposit?");
            while (true) {
                try {
                    amount = Double.parseDouble(newInput.next());
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
            String newAction = newInput.next();
            if (newAction.equals("deposit")) {
                user.depositBank();
            }
            if (newAction.equals("withdraw")) {
                user.depositWithdraw();
            }
            if (newAction.equals("transfer")) {
                user.depositTransfer();
            }

            while (!newAction.equals("deposit") && !newAction.equals("withdraw") && !newAction.equals("transfer") && !newAction.equals("exit")) {
                System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
                newAction = newInput.next();
                if (newAction.equals("deposit")) {
                    user.depositBank();
                }
                if (newAction.equals("withdraw")) {
                    user.depositWithdraw();
                }
                if (newAction.equals("transfer")) {
                    user.depositTransfer();
                }
            }
        }

        if (action.equals("withdraw")) {
            Scanner newInput = new Scanner(System.in);
            Double amount = 0.00;
            System.out.println("How much would you like to withdraw?");
            while (true) {
                try {
                    amount = Double.parseDouble(newInput.next());
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
            String newAction = newInput.next();
            if (newAction.equals("deposit")) {
                user.depositBank();
            }
            if (newAction.equals("withdraw")) {
                user.depositWithdraw();
            }
            if (newAction.equals("transfer")) {
                user.depositTransfer();
            }

            while (!newAction.equals("deposit") && !newAction.equals("withdraw") && !newAction.equals("transfer") && !newAction.equals("exit")) {
                System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
                newAction = newInput.next();
                if (newAction.equals("deposit")) {
                    user.depositBank();
                }
                if (newAction.equals("withdraw")) {
                    user.depositWithdraw();
                }
                if (newAction.equals("transfer")) {
                    user.depositTransfer();
                }
            }
        }

        if (action.equals("transfer")) {
            Scanner newInput = new Scanner(System.in);
            Double amount = 0.00;
            System.out.println("From what account? (for this example, there is only user)");
            String newAction = newInput.next();
            if (newAction.equals("user")) {
                System.out.println("How much would you like to transfer?");
                while (true) {
                    try {
                        amount = Double.parseDouble(newInput.next());
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
            newAction = newInput.next();
            if (newAction.equals("deposit")) {
                user.depositBank();
            }
            if (newAction.equals("withdraw")) {
                user.depositWithdraw();
            }
            if (newAction.equals("transfer")) {
                user.depositTransfer();
            }

            while (!newAction.equals("deposit") && !newAction.equals("withdraw") && !newAction.equals("transfer") && !newAction.equals("exit")) {
                System.out.println("What would you like to do? (deposit, withdraw, transfer, exit)");
                newAction = newInput.next();
                if (newAction.equals("deposit")) {
                    user.depositBank();
                }
                if (newAction.equals("withdraw")) {
                    user.depositWithdraw();
                }
                if (newAction.equals("transfer")) {
                    user.depositTransfer();
                }
            }
        }
    }
}
