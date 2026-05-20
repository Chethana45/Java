import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();

                balance = balance + deposit;

                System.out.println("Updated Balance = " + balance);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Remaining Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }

                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
