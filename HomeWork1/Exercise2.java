import java.io.*;
import java.util.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
public class Exercise2{
	public static void main(String[] args){
	System.out.println("------Exercise2  Using a PrintWriter------");
		
	

PrintWriter printer = null;
Scanner sc = null;
try
  {
	  File f = new File("input.txt");
	  f.createNewFile();
	  File f1 = new File("output.txt");
	  f1.createNewFile();
	  File f2 = new File("reverse.txt");
	  f1.createNewFile();
	  
     String lineSeparator = System.getProperty("line.separator");

     sc = new Scanner(new File("input.txt"));
     FileWriter fw = new FileWriter("output.txt");
     printer = new PrintWriter(fw);

     while(sc.hasNextLine())
     {
        String s = sc.nextLine()+lineSeparator; //Add line separator
        printer.write(s);
     }
  }
  catch(IOException ioe)
  {
     System.out.println(ioe);
  } finally {
    if(sc != null) {
       sc.close();  
    }
    if(printer != null) {
      printer.flush();
      printer.close();
     }
 }
 
 
        System.out.println("--------Reverse content-------------");
	try{
        File file = new File("input.txt");
        long length = file.length(); 
        String encoding = "UTF-8"; 
        InputStream content = new FileInputStream(file); 
        // Now the real job.
        Reader input = new InputStreamReader(content, encoding);
        RandomAccessFile output = new RandomAccessFile(new File("reverse.txt"), "rwd");
        CharsetEncoder encoder = Charset.forName(encoding).newEncoder();

        for (int data; (data = input.read()) != -1;) {
            ByteBuffer bytes = encoder.encode(CharBuffer.wrap(new char[] { (char) data }));
            length -= bytes.limit();
            output.seek(length);
            output.write(bytes.array());
        }
	}catch(IOException e){
		System.out.println(e);
	}
	
	}
}