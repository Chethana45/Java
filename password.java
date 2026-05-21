import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        System.out.print("Enter password: ");
        password = sc.nextLine();

        if (password.length() >= 8) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
