import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
 public static void main(String[] args)throws IOException{
	//1.Declaring the variable
	String text="";		 
   	Scanner sc = new Scanner(System.in);		 
	
	 //2.Connecting to the server
	 Socket s = new Socket("127.0.0.1",12345);
	Scanner sc1 = new Scanner(s.getInputStream());	
	PrintWriter pw = new PrintWriter(s.getOutputStream());
	
	 //3.Passing the word to the server
	 System.out.println("Enter a Sentense:");
	text = sc.nextLine();
	//4.printing the message from the server
	pw.println(text);
	pw.flush();
	
	 //5.printing to the console
	String temp = sc1.nextLine();
	System.out.println(""+temp);
	
	
 
 }

}
