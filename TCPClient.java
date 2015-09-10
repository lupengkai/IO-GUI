import java.net.*;
import java.io.*;

public class TCPClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("127.0.0.1",6666);
		OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("Hello Server");
		dos.flush();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());
		//System.out.println(dis.readUTF());
		dos.close();
		s.close();


	}
}