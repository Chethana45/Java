import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for(String word : words) {
            String reversed = "";

            for(int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.print(reversed + " ");
        }
    }
}
