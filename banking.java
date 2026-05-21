import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter deposit amount: ");
            int amount = sc.nextInt();

            balance = balance + amount;

            System.out.println("Updated Balance = " + balance);

        } else if (choice == 2) {

            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Remaining Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }

        } else {
            System.out.println("Invalid Choice");
        }
    }
}
