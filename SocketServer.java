import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
 public class SocketServer
 {
   public static void main(String args[])
   {
      try
	  {
	     System.out.println("Waiting for Clients...");
		 ServerSocket ss=new ServerSocket(9806);
		 Socket soc=ss.accept();
		 System.out.println("Connection established..");
		 DataInputStream din=new DataInputStream(s.getInputStream());
		 DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 String str="",str2="";
		 while(!str.equals("stop"))
		 {
			 str=din.readUTF();
			 System.out.println("Client Says : "+str);
			 str2=br.readLine();
			 dout.writeUTF(str2);
			 dout.flush();
		 }
		 din.close();
		 s.close();
		 ss.close();
	  }
	  catch(Exception e)
	  {
	    System.out.println(e);
	  }
   }
 }