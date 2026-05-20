import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units;
        double bill;

        System.out.print("Enter electricity units: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 300) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4);
        }

        System.out.println("Electricity Bill = " + bill);
    }
}
