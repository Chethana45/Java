import java.util.Scanner;

public class HotelBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity;
        double total;

        System.out.println("Menu");
        System.out.println("1. Pizza - 150");
        System.out.println("2. Burger - 100");

        System.out.print("Enter item choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        if (choice == 1) {
            total = quantity * 150;
            System.out.println("Total Bill = " + total);
        } else if (choice == 2) {
            total = quantity * 100;
            System.out.println("Total Bill = " + total);
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
