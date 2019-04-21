public class Client1 implements Runnable{
	private volatile Thread stopMe;
 public void run(){
	 for(int i=0;i<5;i++){
		 try{Thread.sleep(1000);}catch(Exception e){}
		 System.out.println("text from Client1");	 
	 }
 }

}