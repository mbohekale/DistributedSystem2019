
import java.rmi.*;

public class AppendText
	extends java.rmi.server.UnicastRemoteObject
	implements AppendTextInterface{	
	
	 public AppendText() throws RemoteException{
        int a,b;
    }
	
    public int add(int a,int b) throws RemoteException{
        return (a+b);
    }
    public int sub(int a,int b) throws RemoteException{
        return (a-b);
    }
    public int mul(int a,int b) throws RemoteException{
        return (a*b);
    }
    public int div(int a,int b) throws RemoteException{
        return (a/b);
    }
	
	
}