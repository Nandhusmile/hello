package SkillRack03;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialCharRemove 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter :");
	String str=s.nextLine();
	ArrayList<Character> al=new ArrayList<Character>();
	
	for(int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		
		if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
		{
			if(!al.contains(c))
			{
				al.add(c);
				
			}
		}
	}
    for(int i=0;i<al.size();i++)
    {
    	int no=0;
    	char c=al.get(i);
    	for(int j=0;j<str.length();j++)
    	{
    		if(str.charAt(j)==c)
    		{
    			no++;
    			
    		}
    		
    	}
    System.out.println(c+"="+no);
    }
		
	}

}
