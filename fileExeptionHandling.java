import java.io.File;
import java.io.IOException;

public class fileExeptionHandling {
    public static void main(String[] args){
        try{
            File Obj = new File("myfile.txt");
            if(Obj.createNewFile()){
                System.out.println("File is created! "+Obj.getName());
            }else{
                System.out.println("File is already exitst");
            }
        }catch(IOException e){
                System.out.println("An error has occured.");
                e.printStackTrace();
            }
    }
}
