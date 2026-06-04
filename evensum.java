import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of Even Numbers = " + sum);
    }
}
