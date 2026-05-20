import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        int guess;

        System.out.print("Guess the number (1-10): ");
        guess = sc.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct Guess!");
        } else {
            System.out.println("Wrong Guess!");
        }
    }
}
