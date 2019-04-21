public class Client2  implements Runnable{
 public void run(){
	 for(int i=0;i<5;i++){
		 try{Thread.sleep(1000);}catch(Exception e){}
		 System.out.println("Client2 is improving"+" "+i);
		 
		 
	 }
 }

}