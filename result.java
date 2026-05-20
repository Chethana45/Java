import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, total;
        double average;

        System.out.print("Enter marks of 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 75) {
            System.out.println("Grade B");
        } else if (average >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
