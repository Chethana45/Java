import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String num = sc.nextLine();

        for(char i = '0'; i <= '9'; i++) {
            int count = 0;

            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == i)
                    count++;
            }

            if(count > 0)
                System.out.println(i + " occurs " + count + " times");
        }
    }
}
