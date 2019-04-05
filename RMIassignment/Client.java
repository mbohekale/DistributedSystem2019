
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.registry.*;
import java.util.*;

public class Client{
	public static void main (String [] args)
	throws RemoteException,NotBoundException,MalformedURLException,RemoteException{
		Client c = new Client();
		c.connectRemote();
	}
	public void connectRemote()throws RemoteException{
		String host = "localhost";
		int port = 9999;		
		
		try{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two number:");
			int a =sc.nextInt();
			int b =sc.nextInt();
			int result = a+b;
			int result1 =a-b;
			int result2 =a*b;
			int result3 =a/b;
			System.out.println("Addition:"+result);
			System.out.println();
			System.out.println("Substraction:"+result1);
			System.out.println();
			System.out.println("multiplication:"+result2);
			System.out.println();
			System.out.println("multiplication:"+result3);
			Registry reg = LocateRegistry.getRegistry(host,port);
			AppendTextInterface ap =(AppendTextInterface)reg.lookup("Hi Server");
			System.out.println("Addition is:"+ap.add(a,b));
			System.out.println("Substraction is:"+ap.sub(a,b));
			System.out.println("multiplication:"+ap.mul(a,b));
			System.out.println("Division is:"+ap.div(a,b));
			
            
		}catch (NotBoundException ae) {		
		System.out.println(ae);
		}
		catch (RemoteException ae) {		
		System.out.println(ae);
		}
		catch(Exception e){}
    }
        
}	

	
