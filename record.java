import java.util.Scanner;

public class StudentSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Ram", "Sam", "John", "Priya", "Anu"};

        System.out.print("Enter student name: ");
        String search = sc.nextLine();

        boolean found = false;

        for(String name : names) {
            if(name.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Student Found");
        else
            System.out.println("Student Not Found");
    }
}
