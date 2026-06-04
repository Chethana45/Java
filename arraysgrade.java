import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter 5 subject marks:");

        for(int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;

        System.out.println("Average = " + average);

        if(average >= 90)
            System.out.println("Grade A");
        else if(average >= 75)
            System.out.println("Grade B");
        else if(average >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}
