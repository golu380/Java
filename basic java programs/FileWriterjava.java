import java.io.FileWriter;
import java.io.IOException;

public class FileWriterjava {
   public static void main(String[] args){
    try{
        FileWriter Writer = new FileWriter("myfile.txt");
        Writer.write("file in java are seriously good !!");
        Writer.close();
        System.out.println("Successfully written");
    }catch(IOException e){
        System.out.println("An error has occured.");
        e.printStackTrace();
    }
   } 
}
