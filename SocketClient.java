import java.net.Socket;
import java.io.*;

public class SocketClient
{
   public static void main(String args[])
   {
     try
	 {
	    System.out.println("Client Started...");
		Socket s=new Socket("localhost",9806);
	    DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while(!str.equals("stop"))
        {
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2=din.readUTF();
			Sysytem.out.println("Server Says : "+str2);
			
		}			
		dout.close();
		s.close();
	 }
	 catch(Exception e)
	 {
	    System.out.println(e);
	 }
   }
}