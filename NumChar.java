package Property;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumChar {
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		char charA=s.next().toLowerCase().charAt(0);
		String temp = " ";
		
		int total=0;
		
		
		File inputFile =new File("E:\\java\\student details\\SampleProgram\\input.txt");
		FileReader in=new FileReader(inputFile);
		
		int ch;
		while((ch=in.read())!=-1)
		{
					
			temp +=(char)ch;
		}
		System.out.println(temp);
	    for(int i=0;i<temp.length();i++)
		{
	    	if(temp.charAt(i)==charA)
	    	{
	    		total++;
	    	}
		}
		if(total>0)
		{
			System.out.println(charA + " occurs " +total+ " times");
		}
								
		else
		{
			System.out.println("not occurs " +total+ " times");
		}
		in.close();
		}
}
