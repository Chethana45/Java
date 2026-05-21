import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int books = 100;

        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                if (books > 0) {
                    books--;
                    System.out.println("Book Issued Successfully");
                } else {
                    System.out.println("No Books Available");
                }
                break;

            case 2:
                books++;
                System.out.println("Book Returned Successfully");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        System.out.println("Available Books = " + books);
    }
}
