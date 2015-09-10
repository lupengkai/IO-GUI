import java.net.*;
import java.io.*;


public class TalkServer
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(6666);
	    Socket s = ss.accept();
	    //Client输入
	    DataInputStream dis = new DataInputStream(s.getInputStream());
	    //Sever输出
	    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	    //键盘输入
	    DataInputStream sdis = new DataInputStream(System.in);
	    String message = null;//向Client发的消息内容
	    System.out.println("Client:" + dis.readUTF());
	    message = sdis.readLine();
	    while(message != "bye")
	    {
	    	dos.writeUTF(message);
	    	System.out.println("Server:" + message);
	    	System.out.println("Client:" + dis.readUTF());
	    	
	    	
	    	message = sdis.readLine();

	    }
	    dos.close();
	    dis.close();
	    ss.close();

	}

}