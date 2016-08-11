package Logic1;

import java.util.Scanner;

public class AlphabetOrNot
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a username");
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(Character.isAlphabetic(ch))
		{
			System.out.println("Is A Character");
		}
		else
		{
			System.out.println("Is A Number");
		}
	}

}
