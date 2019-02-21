import java.net.*;
import java.io.*;
import java.util.*;
public class Client
{
	public static void main(String[] args)throws Exception{
		try{
		int number;
		Scanner sc1 = new Scanner(System.in);
		
		
				
		int port=12345;
		String computer = "localhost";
		Socket s = new Socket(computer,port);
		Scanner sc = new Scanner(s.getInputStream());
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		
		//sending it to the server
		System.out.println("Please enter a number:");
		number=sc1.nextInt();
		
		//printing it from the server
		pw.println(number);
		pw.flush();
		
		//printing on the console
		int temp=sc.nextInt();
		System.out.println(temp);
		}catch(IOException e){
				
		System.out.println(e);
		}
	}
}