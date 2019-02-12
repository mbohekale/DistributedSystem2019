import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
 public static void main(String[] args)throws IOException{
	int n;
		 
    Scanner sc = new Scanner(System.in);		 
	
	Socket s = new Socket("127.0.0.1",12345);
	Scanner sc1 = new Scanner(s.getInputStream());
	
	PrintWriter pw = new PrintWriter(s.getOutputStream());
	
	System.out.println("Enter a number:");
	n = sc.nextInt();
	// from the server
	pw.println(n);
	pw.flush();
		
	int temp = sc1.nextInt();
	for(int i =0;i<10;i++){
	System.out.println(temp);
	}
	
	
	
 
 }

}