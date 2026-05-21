import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for Voting");
        } else {
            System.out.println("Not Eligible for Voting");
        }
    }
}
