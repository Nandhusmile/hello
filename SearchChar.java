package Property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchChar 
{
	public static void main(String[] args) throws IOException
{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		char charA=s.next().charAt(0);
		String temp = "";
		boolean flag=false;
		
		
		File inputFile =new File("E:\\java\\student details\\SampleProgram\\input.txt");
		FileReader in=new FileReader(inputFile);
		
		int ch;
		while((ch=in.read())!=-1)
		{
					
			temp +=(char)ch;
		}
	    for(int i=0;i<temp.length();i++)
		{
		if(temp.charAt(i)==charA)
		{
			flag= true;
			break;
		}
		}
		if(flag)
		{
			System.out.println("\ncontain");
		}
								
		else
		{
			System.out.println("\nnot contains");
		}
		in.close();
		}

	}


