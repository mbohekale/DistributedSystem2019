import java.util.*;
import java.io.*;

public class Main {

public static void main(String[] args) {
	 HashMap<String,String> lines=new HashMap<String,String>();
			Set<String> seen=new HashSet<String>();
    try{	
		
	File f = new File("text.txt");
	f.createNewFile();    
		
        FileInputStream fstream=new FileInputStream("text.txt");
        DataInputStream in=new DataInputStream(fstream);
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        ArrayList arr=new ArrayList();
        String str,str1;
        int i=0;
        while((str=br.readLine())!=null){
            i++;
			str1=Integer.toString(i);
           if(lines.containsValue(str)){
		if (seen.add(str)) {
        System.out.println(str);
		}
		} else {
          lines.put(str1, str);
			}
        }
        in.close();
    }catch(Exception e){
        System.out.println(e);
    }

}
}