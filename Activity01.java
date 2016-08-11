package MSPractice01;

import java.util.Scanner;

public class Activity01 
{
	public static void main(String[] args) 
	{
    int n;
    System.out.println("Enter the number");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
	int factresult = 1;
	for (int i = 1; i <= n; i++) {
	factresult= factresult * i;
	}
	System.out.println("The factorial of  is " + factresult);
	 }
	}


