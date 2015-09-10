import java.net.*;
import java.io.*;

public class TCPServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(6666);
		while(true){
			Socket s = ss.accept();
			System.out.println("A client connect.");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());

			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("byebye");
			dos.writeUTF("go");
			//dos.flush();
			dis.close();
			s.close();
		}
		
	}
}