package SkillRack03;

public class Power 
{
	public static void main(String[] args) 
	{
	int num=12345;
	String str=Integer.toString(num);
	String no[]=str.split("");
	int temp=0;
	double j=0;
	for(int i=0;i<no.length;i++)
		{
		j=j+Math.pow(Integer.parseInt(no[i]),temp);
			temp=Integer.parseInt(no[i]);
		}
		System.out.println(j);
		
	}

}
