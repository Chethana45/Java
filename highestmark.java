import java.util.Scanner;

public class HighestMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Ram", "Sam", "Priya"};
        int[] marks = {78, 95, 89};

        int max = marks[0];
        String topper = names[0];

        for(int i = 1; i < marks.length; i++) {
            if(marks[i] > max) {
                max = marks[i];
                topper = names[i];
            }
        }

        System.out.println("Topper: " + topper);
        System.out.println("Marks: " + max);
    }
}
