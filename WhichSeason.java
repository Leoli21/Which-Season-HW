import java.util.Scanner;
/***
 * 
 * @author Leo Li
 *
 */
public class WhichSeason 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input numerical value of your birth month ");
		int birthMonth = input.nextInt();
		if (birthMonth >= 1 || birthMonth <=12){
			
			
			if (birthMonth >= 1 || birthMonth == 12)
			{
				System.out.println("You were born in the the winter.");
			}
			else if (birthMonth >= 3 && birthMonth <= 5)
			{
				System.out.println("You were born in the spring.");
			}
			else if (birthMonth >= 6 && birthMonth <= 8)
			{
				System.out.println("You were born in the summer.");
			}
			else if (birthMonth >= 9 && birthMonth <= 11)
			{
				System.out.println("You were born in the fall.");
			}
		
		}
		else
		{
			System.out.println("Invalid Month.");
		}
	}
}

