import java.net.*;
import java.io.*;


public class TestClient
{
	public static void main(String[] args)
	{
	
	try{
		Socket s = new Socket("127.0.0.1",6666);
		InputStream is = s.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readUTF());
		dis.close();
		s.close();
	   }
	 catch(ConnectException ce)
	 {
	 	ce.printStackTrace();
	 	System.out.println("连接出错" + ce);
	 } 
	 catch(IOException ioe)
	 {
	 	ioe.printStackTrace();
	 }
	}


}