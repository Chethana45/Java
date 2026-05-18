import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter first array:");

        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");

        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Common elements:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
