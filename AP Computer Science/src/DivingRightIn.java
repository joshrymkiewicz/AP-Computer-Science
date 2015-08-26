
import java.util.Scanner;

public class DivingRightIn {
	static int Year;
	

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello and welcome what is your first name?");
		String sentence = scanner.nextLine();
		System.out.println("Hello " + sentence);
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you ?");
		int age = input.nextInt();
		
		if (age <= 16) 
		{
			System.out.println("Awesome!!! you can drive");
		}
		if (age == 17) 
		{
			System.out.println("NICEEE !! You are the same age as me");
		} 
		
		else 
		{
			System.out.println("Dudeeeeeee !!!  dont smoke its not cool");
		}
		System.out.println("what year were you born?");
		
		int year = input.nextInt();
		for (int i = 0; i < age; i++) 
		{
			if (i == 1)
	
			{
				System.out.println("In " + year + " you were " + i + " year old");
				i++;
				year++;
			}
			
			System.out.println("In " + year + " you were " + i + " years old");
			
			year++;
			
		}
		System.out.println("In dog years you are " + age * 7 + " years old.");
	}
}