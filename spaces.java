import java.util.Scanner;

public class TextAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int words = str.split(" ").length;
        int chars = str.length();
        int spaces = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ')
                spaces++;
        }

        System.out.println("Words = " + words);
        System.out.println("Characters = " + chars);
        System.out.println("Spaces = " + spaces);
    }
}
