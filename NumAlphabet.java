package Property;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumAlphabet {

	public static void main(String[] args) throws IOException {
		File inputFile =new File("E:\\java\\student details\\SampleProgram\\input.txt");
		FileReader in=new FileReader(inputFile);
		int[] alpha = new int[26];
		int ch;
		while((ch=in.read())!=-1)
		{
			if((char)ch!=' ')
			{
				alpha[ch-97]++;
			}
		}
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]>0)
			{
				System.out.println(((char)('a'+i)+"->"+alpha[i]));
			}
		}
in.close();
	}
	}


