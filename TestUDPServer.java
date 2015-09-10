import java.net.*;
import java.io.*;

public class TestUDPServer {
	public static void main(String[] args) throws Exception{
		byte[] buff = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buff,buff.length);
		DatagramSocket ds = new DatagramSocket(6666);
		while (true){
			ds.receive(dp);//数据放入dp，阻塞式方法
			ByteArrayInputStream bais = new ByteArrayInputStream(buff);
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readLong());
		}
	}


}