import java.rmi.registry.*;
public class Client{
	public static void main(String[] args){
		try{
			
		String host= "localhost";
		int port=12345;
		String srvName = "rmiAppendGuy";
		String text = "ready";
		
		Registry registry = LocateRegistry.getRegistry(host,port);
		
		System.out.println(text);
		String [] registers = registry.list();
		
		for(String a :registers)
				System.out.println(a);
		
		
		}catch(Exception e){}
	}

}