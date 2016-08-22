package Property;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Searchstr 
{
	public static void main(String[] args) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		String temp="";
		
		File inputFile=new File("E:\\java\\student details\\SampleProgram\\input.txt");
		File outputFile=new File("E:\\java\\student details\\SampleProgram\\output.txt");
			FileReader in=new FileReader(inputFile);
			
		
	int c;
	while((c=in.read())!=-1)
	{
      
	   temp +=(char)c;
	  
	   System.out.print((char)c);
	}
	if(temp.contains(str))
	{
		System.out.println("\nContains");
	
	}
	else
	{
		System.out.println("\nnot Contains");
      	
	}
	in.close();

}

}
