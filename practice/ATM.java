import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 11000;
        int pin = 1505;s
        System.out.print("Please enter 4 digit PIN: ");
        int enteredPin = input.nextInt();

        if (enteredPin == pin) {
            System.out.println("Valid credentials!");

            System.out.println("1. Check balance");
            System.out.println("2. Withdraw cash");
            System.out.println("3. Deposit cash");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your current balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = input.nextDouble();

                    if (amount > balance) {
                        System.out.println("ERROR! Insufficient funds");
                    } else if (amount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance -= amount;
                        System.out.println("Success! New balance is: " + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid deposit amount!");
                    } else {
                        balance += deposit;
                        System.out.println("Your balance: " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid option selected!");
            }

        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }

        input.close();
    }
}