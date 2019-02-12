import java.util.*;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Server{
 public static void main(String[] args)throws Exception{
  
		String n ="abc";
		String text;
	 ServerSocket s1 = new ServerSocket(12345);
		Socket ss = s1.accept();
		System.out.println("Connected.......");
	 	Scanner sc = new Scanner(ss.getInputStream());
		PrintStream p = new PrintStream(ss.getOutputStream());
		n = sc.next();
		String temp = n;
		p.println(temp); 
		
 
 }

}