package SkillRack03;

public class Encrypt 
{
	public static void main(String[] args) 
	{
		String str="I LOVE INDIA";
        str=str.toLowerCase();
        int n=2;
        int pos=n-1;
        String op="";
        String[] split=str.split("");
        for(String i:split)
        {
        	if(i.length()<pos)
        	{
        		op+=i;
        	}
        	else
        	{
        		int temp=i.charAt(pos)-97;
        		String temps="";
        		for(int j=0;j<i.length();j++)
        		{
        			if(j!=pos)
        			{
        				int t=(temp-(i.charAt(j)-97));
        				if(t<0)
        				{
        					t=26+t;
        				}
        				temp+=(char)(t+97);
        			}
        			else
        				{
        					temp+=i.charAt(j);
        				}
        			}
        			op+=temps;
        		}
        		op+="";
        	}
        	System.out.println(op.toUpperCase());
        }
	}
	


