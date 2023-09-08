import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Bank bank = null;

        System.out.println("Choose your bank: ");
        System.out.println("1. BMO");
        System.out.println("2. TD");

        int userBank = userInput.nextInt();
        if (userBank == 1)
        {
            System.out.println ("Enter your bank account: ");
            int bankAccount = userInput.nextInt();
            bank = new BMO(bankAccount);
        }
        else if (userBank == 2)
        {
            System.out.println ("Enter your bank account: ");
            int bankAccount = userInput.nextInt();
            System.out.println ("Enter your Pin: ");
            int bankPin = userInput.nextInt();
            System.out.println(bankPin);
            bank = new TD(bankAccount, bankPin);
        }

            while(true) {

                System.out.println("What would you like to do?");
                System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Change pin\n5. Show pin\n6. Exit");

                int userAns = userInput.nextInt();
                if (userAns == 1) {
                    System.out.println("How much would you like to deposit?");
                    int userDeposit = userInput.nextInt();
                    bank.deposit(userDeposit);
                } else if (userAns == 2) {
                    System.out.println("How much would you like to withdraw?");
                    int userWithdraw = userInput.nextInt();
                    bank.withdraw(userWithdraw);
                } else if (userAns == 3) {
                    bank.balance();
                } else if (userAns == 4) {
                    System.out.println("Enter your new PIN");
                    int newPin = userInput.nextInt();
                    bank.setPin(newPin);
                } else if (userAns == 5) {
                    bank.getPin();
                }
                else if (userAns == 6)
                    break;
            }
        }
    }
