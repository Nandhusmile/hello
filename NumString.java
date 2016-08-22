package Property;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumString {
public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a string: ");
    String str = scan.next();
    String str1 = "";
    
    int total = 0;
    File inputFile = new File("E:\\java\\student details\\SampleProgram\\input.txt");
    FileReader in = new FileReader(inputFile);
    
    int c;
    while((c = in.read()) != -1)
    {
        str1 += (char)c;
    }
    
    System.out.println(str1);
    
    for(int i=0; i<str1.length() && (i+str.length()-1)<str1.length();)
    {
      String s = str1.substring(i, i+str.length());
      System.out.println(s);
      if(s.equals(str))
      {
        total++;
        i += str.length();
      }
      else
      {
        i++;
      }
    }
    
    System.out.println("The string "+str+" occurs "+total+" times.");
    
    in.close();
    scan.close();
}
}
