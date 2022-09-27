import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class FileWriterDemo 
 
{
public static void main(String[] args)
throws IOException{
    //Initialize a string
    String str = "hello world its yours";
    try{
        FileWriter fw = new FileWriter("file1.txt");
    //read each character from string and write 
    //into FileWriter
    for(int i = 0;i<str.length();i++){
        fw.write(str.charAt(i));
    }
    System.out.println("Successfully Written");
    fw.close();
    }catch(Exception e){
        e.getStackTrace();
    }
    
}
}  

