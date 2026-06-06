import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Capital of India?");
        System.out.println("1. Chennai");
        System.out.println("2. Delhi");
        System.out.println("3. Mumbai");

        int answer = sc.nextInt();

        if(answer == 2)
            score++;

        System.out.println("Score = " + score);
    }
}
