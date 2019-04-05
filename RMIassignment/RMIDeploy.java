
import java.rmi.registry.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDeploy{
	public static void main (String [] args) throws RemoteException{
		final int PORT = 9999;
		try{
			
			
		 Registry reg = LocateRegistry.createRegistry(PORT);
		
		reg.rebind("Hi Server",new AppendText());
		System.out.println("Server is running...");
		}catch(RemoteException e){
			System.out.println(e);
		}
	}
	
}