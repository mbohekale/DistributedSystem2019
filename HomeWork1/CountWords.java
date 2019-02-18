
import java.util.*;
public class CountWords{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			printWordsOfLines(scan);
			
			
	}
	 public static void printWordsOfLines(Scanner x){
 Scanner line=x;
 Scanner word=x;
int lines = 0;
System.out.println("Enter q to quite input");
int words=0;

while(line.hasNextLine()){
   String xx=line.next();

   String w[]=xx.split("  ");
   String l[]=xx.split("\n");

   words+=w.length;
   lines+=l.length;

   if(xx.equals("q"))
       break;
  else   
      x.nextLine();
    }
  System.out.println("lines: " + lines);
  System.out.println("words: " + words);
}
}