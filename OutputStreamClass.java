//public void wirte(int) throws IOEception --> It is used 
// to write a byte to the current output Stream.

//public void write(byte[]) throws IOEception--> is used to wrte
// an array of byte to the current output stream.

//pubic void flush() throws IOEception --> flushes the current output
//stream.

//public void close() throws IOEception--> is used to close the 
//current output stream.

//public abstract in read() throws IOEception--> reads the next byte
//of data from the input stream. It returns -1 at he end of the file.

//public int available() throws IOEception ---> returns an astimate of the number of bytes
//that can be read from the current input stream.

//public void close() throws IoExcepttion---L> is used to close the 
//current input stream.
import java.io.FileOutputStream;

public class OutputStreamClass {
    public static void main(String args[]){
        try{
            FileOutputStream fout = new FileOutputStream("D://testout.txt");
            fout.write(65);
            fout.write(97);
            fout.close();
            System.out.println("Success...");


        }catch(Exception e){
            System.out.println(e);
        }
    }
}

//protected void finalize()--> It si used to clean up the connection
//with the file output stream.

//void write(byte[] ary)--> It is used to write ary.length byte from 
//the byte array to the file output stream.

//void write(byte[] ary, int off, int len)--> It is used to write len
// byte from the byte array starting at offset off to the file output
//stream

//void write(int b)--> It is used to write the specified byte to the 
// fkle output stream

// FileChannel getChannel()--> It is used to return the file output
//stream

//FileDescriptor getFD()--> It is used to return the file descriptor 
//associated with the stream

//void close()--> It is used to closes the file output stream.