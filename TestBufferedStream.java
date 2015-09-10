import java.io.*;


public class TestBufferedStream
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("e:\\javawebcode\\TestBufferedStream.java");
		BufferedInputStream bis = new BufferedInputStream(fis); 
		System.out.println((char)bis.read());
		System.out.println((char)bis.read());
		bis.mark(100);
		int c = 0;
		for( int i = 0; i<=10&&(c=bis.read())!= -1;i++)
		{
			System.out.print((char)c + " ");
		}
		bis.reset();
		for( int i = 0; i<=10&&(c=bis.read())!= -1;i++)
		{
			System.out.print((char)c + " ");3
		}
		bis.close();

	}
}