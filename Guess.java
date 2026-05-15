import java.util.Scanner;
import java.lang.Math;
 
class Guess
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a =(int)(Math.floor(Math.random()*10)) + 1;
		System.out.println("Enter the value within the range(1-10)");
		while(true)
		{
			System.out.print("Enter the guessed value: ");
			int b = scan.nextInt();
			if(a==b)
			{
				System.out.println("Congratulations you guessed the code");
				break;
			}
			else if(b>a)
			{
			System.out.println("You failed to guess and the number is less than "+b);
			}
			else
			{
				System.out.println("You failed to guess and the number is greater than "+b);
			}
		}
	}
}
 