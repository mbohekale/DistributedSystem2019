import java.net.*;
import java.util.*;
import java.io.*;
public class Server1{
	public static void main(String[] args) throws Exception{
		int port =12345;
		
		try(
			ServerSocket ss = new ServerSocket (port);
			Socket s = ss.accept();
			
			Scanner sc = new Scanner(s.getInputStream());
			PrintWriter printer = new PrintWriter(s.getOutputStream());
			
		){
			String text =sc.nextLine();
			printer.println(text.length());
			
			printer.flush();
		}
		
	}
}