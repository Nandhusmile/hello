package SkillRack03;

import java.util.Scanner;

public class NumRightTriangle 
{
	public static void main(String[] args) 
	{
    int n=5;
	int a=1;
	for(int i=1;i<=n ;i++)
	{
		String str="";
	for(int j=0;j<n-i;j++)
	{
	  str +=" ";
	}
	for(int j=1;j<=i;j++)
	  {
		  str +=a;
		  a++;
		  if(a>9)
		  {
			  a=0;
		  }
	  }
	System.out.println(str);
	}
	
	}
}