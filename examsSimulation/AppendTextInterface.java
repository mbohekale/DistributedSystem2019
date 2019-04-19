import java.rmi.RemoteException;
import java.rmi.Remote;

public interface AppendTextInterface extends Remote{
	
	String append(String text) throws RemoteException;

}