import java.io.*;
import java.net.*;

public class MyClient 
{
  public static void main(String args[])
  {
    try
	{
	  Socket s=new Socket("localhost",6666);
	  DataOutputStream dout=new DataOutputStream(s.getOutputStream());;
	  System.out.println("Sending message to Server");
	  dout.writeUTF("Hello Server, My name is Suraj Singh Topal");
	  dout.flush();
	  dout.close();
	  s.close();
	}
	catch(Exception e)
	{
	   System.out.println(e);
	}
	
  }
}