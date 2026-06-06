import java.util.Scanner;

public class SubstringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String sub = sc.nextLine();

        if(text.contains(sub))
            System.out.println("Substring Found");
        else
            System.out.println("Substring Not Found");
    }
}
