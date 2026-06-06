import java.util.Scanner;

public class VowelWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        int count = 0;

        for(String word : words) {
            char ch = Character.toLowerCase(word.charAt(0));

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Words starting with vowels = " + count);
    }
}
