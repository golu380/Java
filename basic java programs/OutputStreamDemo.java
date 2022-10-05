import java.io.*;
class OutputStreamDemo {
    public static void main(String args[]) throws Exception {

        OutputStream os = new FileOutputStream("file.txt");
        byte b[] = {65,66,67,68,69,70};

        //Illustrating write(bytem[] b ) by method
        os.write(b);
        os.flush();
        //illustrating write(int b) method
        for(int i = 71;i<75;i++){
            os.write(i);
        }
        os.flush();
        os.close();
}
}
