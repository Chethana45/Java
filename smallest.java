import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element is: " + smallest);
    }
}
