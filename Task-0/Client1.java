import java.util.*;
import java.io.*;
import java.net.*;

class Client1
{
    public static void main(String[] args)
        throws Exception
    {
        int port = 12345;
        String computer = "localhost";

        try (
            Socket s = new Socket(computer, port);

            Scanner sc = new Scanner(s.getInputStream());
            PrintWriter pw = new PrintWriter(s.getOutputStream());
        ) {
            pw.println(args[1]);
            pw.flush();

            int textLength = sc.nextInt();
            System.out.println(textLength);
        }

    }
}