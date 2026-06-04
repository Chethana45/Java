import java.util.Scanner;

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        System.out.println("Enter first array:");

        for(int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter second array:");

        for(int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean equal = true;

        for(int i = 0; i < 5; i++) {
            if(arr1[i] != arr2[i]) {
                equal = false;
                break;
            }
        }

        if(equal)
            System.out.println("Arrays are Equal");
        else
            System.out.println("Arrays are Not Equal");
    }
}
