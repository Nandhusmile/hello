package Logic1;

import java.util.Scanner;

public class OddEven 
{
	public static void main(String[] args) 
	{
		int a;
		System.out.println("Enter a number :");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");	
	}	
}
