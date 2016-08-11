package Logic1;

import java.util.Scanner;

public class Positive 
{
	public static void main(String[] args) 
	{	
		int b;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		b=s.nextInt();
 		if(b>0)
			System.out.println("Positive");
		else if(b==0)
			System.out.println("Zero");
		else
			System.out.println("Negative");
		
		
	}

}
