import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String largest = words[0];

        for(String word : words) {
            if(word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest Word: " + largest);
    }
}
