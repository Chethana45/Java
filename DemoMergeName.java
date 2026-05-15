import java.util.Scanner;
import java.util.Arrays;
 
public class DemoMergeName
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total number of students registered for the online quiz: ");
        int quiz_size = scan.nextInt();
        scan.nextLine();
        String[] quiz = new String[quiz_size];
        System.out.println("Enter the names of the students who are all registered for the quiz competition: ");
        for(int i=0;i<quiz_size;i++)
        {
            quiz[i]= scan.nextLine();
        }
        System.out.print("Enter the total number of students registered for the paper presentation ");
        int presentation_size = scan.nextInt();
        scan.nextLine();
        String[] paper = new String[presentation_size];
        System.out.println("Enter the names of the students who are all registered for the paper presentation : ");
        for(int i=0;i<presentation_size;i++)
        {
            paper[i]= scan.nextLine();
        }
        String[] merged = new String[quiz_size+presentation_size];
        System.arraycopy(quiz,0,merged,0,quiz_size);
        System.arraycopy(paper,0,merged,quiz.length, paper.length);
        System.out.println("Displaying the names of the participating students: ");
        Arrays.sort(merged);
        for(int i=0;i<merged.length;i++)
        {
            System.out.println(merged[i]);
        }
    }
}