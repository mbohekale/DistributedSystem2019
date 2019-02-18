import java.util.*;
public class Main{
	public static void main(String[] args){		
	
	System.out.println("Fibaoncci Recursive order:" +fibro(5));
	System.out.println("Fibaoncci itfibbo order:" +fibro(3));
	System.out.println("Fibaoncci seq:" +fibro(9));
	System.out.println("---------------------");
	
	System.out.println("printdivisors:" + printdivisors(5) );
	
	
	
	
	
	}
	public static int fibro(int a){
		if(a==0)
		return 0;
		if(a==1)
			return 1;
		return fibro(a-1)+fibro(a-2);
	
	}
	
	public static int itfibbo(int a){

	int first = 1;
	int prev = 1;
		
	for(int i=2; i<a; i++) {
		int temp = first;
		first+= prev;
		prev = temp;
	}
	return first; 
    }
	
	public static void fibboseq(int a){

	int first = 1;
	int prev = 1;

	System.out.println(first + "\n" + prev);
	for(int i=2; i<a; i++) {
		int temp = first;
		first+= prev;
		System.out.println(first);
		prev = temp;
	}
    }
	
	  public static void printdivisors(int a){
	
	for(int i=1; i<=a; i++){
		if(a%i==0)
			System.out.println(i);
	}
   }

}