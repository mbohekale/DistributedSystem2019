import java.net.*;
import java.io.*;
import java.util.*;
public class Server
{
	public static void main(String[] args)throws Exception{
		try{
		int number;
			
		int port=12345;
		ServerSocket ss = new ServerSocket(port);
		Socket s = ss.accept();
		System.out.println("Server is connected........");
		
		Scanner sc = new Scanner(s.getInputStream());
		number=sc.nextInt();
		int temp= number*5;
		
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		pw.println(temp);
		pw.flush();		
		
		
		
		
		
		}catch(IOException e){
		System.out.println(e);
		}
	}
}