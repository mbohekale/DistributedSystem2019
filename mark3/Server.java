
public class Server{
	public static void main(String[] args){
		try{		
		Client1 cl1=new Client1();
		Thread mn = new Thread(cl1,"Market News");
		mn.start();
		
		
		Client2 cl2=new Client2();
		Thread mn1 = new Thread(cl2,"Good News");
		mn1.start();
		System.out.println("program is finished");
		
		}catch(Exception e){}
	}

}