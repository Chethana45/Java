import java.util.Scanner;

public class PositiveNegativeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0;

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] >= 0)
                positive++;
            else
                negative++;
        }

        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);
    }
}
