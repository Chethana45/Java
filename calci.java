import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, choice;

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");

        choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
