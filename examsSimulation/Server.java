import java.rmi.registry.*;
public class Server{
	public static void main(String[] args){
		try{
		
		final int PORT =12345;		
		
		Registry registry = LocateRegistry.createRegistry(PORT);
		registry.rebind("rmiAppendGuy", new ConnectionToRMI("ready"));
		registry.rebind("rmiAppendGirl", new ConnectionToRMI("ready"));
		
		
		
		
		}catch(Exception e){}
	}

}