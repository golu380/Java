import java.io.*;


class FileReaderr {
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("file1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        // System.out.println(br.readLine());// it can also applied here ..
        
        while((s = br.readLine()) != null){
                System.out.println(s);
        }
        fr.close();
        br.close();
    }
}
