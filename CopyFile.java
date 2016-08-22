package Property;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile  
{
	public static void main(String[] args) throws IOException {
		File inputFile=new File("E:\\java\\student details\\SampleProgram\\input.txt");
		File outputFile=new File("E:\\java\\student details\\SampleProgram\\output.txt");
	FileReader in=new FileReader(inputFile);
	FileWriter out=new FileWriter(outputFile);
	int c;
	while((c=in.read())!=-1)
			{
		out.write(c);
		System.out.println(c);
			}
	in.close();
	out.close();
	}

}
