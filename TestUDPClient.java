import java.net.*;
import java.io.*;

public class TestUDPClient{
	public static void main(String[] args) throws Exception{
		long a=100000L;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(a);
		byte[] buff = baos.toByteArray() ;
		DatagramPacket dp = new DatagramPacket(buff,buff.length,
			new InetSocketAddress("127.0.0.1",6666)
			);
		DatagramSocket ds = new DatagramSocket(9999);
		ds.send(dp);
		ds.close();

	}
}