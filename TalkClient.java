import java.net.*;
import java.io.*;


public class TalkClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost",6666);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		DataInputStream sdis = new DataInputStream(System.in);
		String message = null;
		message = sdis.readLine();
		while(message !="bye")
		{
			
			dos.writeUTF(message);
			System.out.println("Client:" + message);
			System.out.println("Server:" + dis.readUTF());
			message = sdis.readLine();

		}
		dis.close();
		dos.close();
		s.close();


	}
}