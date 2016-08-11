package MSPractice01;

import java.util.Scanner;

public class Activity04 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter the string : ");
	    String str1=sc.next();
	    StringBuffer b1=new StringBuffer(str1);
	    StringBuffer str2 =b1.reverse();
	    String str3=new String(str2);
	    int comparevalue=str1.compareTo(str3);
	    if(comparevalue==0)
	    {
	      System.out.println("The string "+str1+" is  palindrome:");
	    }
	    else
	    {
	      System.out.println("The String is "+str1+" not  palindrome");
	    }
	    
	}
}
