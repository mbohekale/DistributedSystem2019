import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
 public static void main(String[] args)throws IOException{
	String text="";
		 
    Scanner sc = new Scanner(System.in);		 
	
	Socket s = new Socket("127.0.0.1",12345);
	Scanner sc1 = new Scanner(s.getInputStream());
	
	PrintWriter pw = new PrintWriter(s.getOutputStream());
	
	System.out.println("Enter a Sentense:");
	text = sc.nextLine();
	// from the server
	pw.println(text);
	pw.flush();
	
	String temp = sc1.nextLine();
	System.out.println(""+temp);
	
	
 
 }

}