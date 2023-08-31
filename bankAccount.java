import java.util.Scanner;

class bankAccount {
    int balance, previousTransaction, withdraw, deposit;
    String customerName, customerId;


    bankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = deposit + amount;
            previousTransaction = balance;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            withdraw = withdraw - amount;
            previousTransaction = amount;
            balance = balance - amount;
        }
    }

    void PreviousTransaction(int amount) {
        previousTransaction = amount;
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured...");
        }


    }

    void showMenu() {
        //welcome the user to the app with user id followed by a menu with access options
        char option = '\0';
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please, enter a character from the following menu...");
        System.out.println("A: Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit");

        do {

            option = Scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("=========================================================================");
                    System.out.println(balance);
                    System.out.println("=========================================================================");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("=========================================================================");
                    System.out.println("Enter amount to deposit: ");
                    System.out.println("=========================================================================");
                    int amount = Scanner.nextInt();
                    System.out.println(balance); //displays the balance of the bank account
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("=========================================================================");
                    System.out.println("Enter amount to withdraw");
                    System.out.println("=========================================================================");
                    int amount2 = Scanner.nextInt();
                    withdraw(amount2);
                    System.out.println(balance = -balance);
                    System.out.println("\n");

                case 'D':
                    System.out.println("=========================================================================");
                    System.out.println("Previous Transaction: " + previousTransaction); //use correct variables to display proper amount
                    System.out.println("=========================================================================");

                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*******************************************************************");
                    break;

                default:
                    System.out.println("Invalid option, please try again...");
                    break;


            }

        } while (option != 'E');
        System.out.println("Thank you for using our services!!!");
    }
}
