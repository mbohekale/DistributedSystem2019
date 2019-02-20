import java.io.*;
import java.util.*;
public class ReadFile
{

   public static void main(String[] args) throws IOException{

     try {            
            File f = new File("Numbers.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));            
            int sum = 0;
            int count = 0;
            String line = b.readLine();
            while(line != null) {                
                sum += Integer.parseInt(line); // Convert String to int.
                count++;
                line = b.readLine();                
            }
            b.close();
            double average = (double) sum/count;
            System.out.println("Sum: " + sum + ", count: " + count +  ".");              
        }
        catch (IOException e) {
            e.printStackTrace();
        }
   }
}