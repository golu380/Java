// Java Program to Demonstrate FileInputStream Class

// Importing I/O classes
import java.io.*;

// Main class
// ReadFile
class GFG {

	// Main driver method
	public static void main(String args[])
		throws IOException
	{
        FileInputStream fin = new FileInputStream("file.txt");
       //Illustrating getChannel() method
        System.out.println(fin.getChannel());
        //Illustrating getFD() methods
        System.out.println(fin.getFD());
        //illlustrating available methods
        System.out.println("Number of remaining bytes:"+fin.available());
        //Illustrating skip() method
        fin.skip(3);
        System.out.println("Filecontensts: ");
        //reading characters from FileInputstream
        //and wrtite them
        int ch;
        //Holds true till there is data inside file
        while((ch = fin.read()) != -1)
        System.out.println((char)ch);
        //close the file connections using close Method
        fin.close();
		
	}
}
