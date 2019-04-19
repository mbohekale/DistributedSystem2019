import java.rmi.*;
public class ConnectionToRMI 
	extends java.rmi.server.UnicastRemoteObject 
	implements AppendTextInterface{
	String url;
	int port;
	String serviceName;
	public ConnectionToRMI(String serviceName)throws RemoteException{
	this.serviceName=serviceName;
	}
	public String append(String sendText)throws RemoteException{
		return ""+ sendText+serviceName;
	}

	

}