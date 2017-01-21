
import java.util.Scanner;

public class rev_digits 
{

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		int value=scan.nextInt();
		int rev_digit=1;
		while(value!=0)
		{
			rev_digit=value%10;
			value=value/10;
			System.out.print(rev_digit);
		}
		
	}

}
