package WrapperClass;

import java.util.Scanner;

public class StringLogic 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.nextLine();
	char[] arr=new char[str.length()];
	for(int f=0;f<str.length();f++)
		arr[f]=str.charAt(f);
	{
		for(int f=0;f<str.length();f++)
			{
				arr[0]=Character.toUpperCase(arr[0]);
				if(Character.isWhitespace(arr[f]))
				{
					arr[f+1]=Character.toUpperCase(arr[f+1]);
				}
				System.out.print(arr[f]);
			}
		}
	}
	}
	


