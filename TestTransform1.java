import java.io.*;

public class TestTransform1
{
	public static void main(String[] agrs)
	{
	try{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("1.txt",true));
		osw.write("123");
		System.out.println(osw.getEncoding());
		osw.close();
		osw = new OutputStreamWriter(new FileOutputStream("1.txt",true),"ISO8859_1");
		osw.write("jjsssjjj");
		System.out.println(osw.getEncoding());
		osw.flush();
		osw.close();

	}
	catch(IOException ioe)
	{
		ioe.printStackTrace();
	}
}}