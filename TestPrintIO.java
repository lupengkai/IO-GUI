import java.io.*;


public class TestPrintIO
{
	public static void main(String[] args)
	{
		PrintStream ps = null;
		try
		{
			FileOutputStream fos = new FileOutputStream("e:\\javawebcode\\2.txt");
			ps = new PrintStream(fos);
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		if (ps != null)
		{
			System.setOut(ps);
		}
		System.out.println("123");
	}
}