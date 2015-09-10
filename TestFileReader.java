import java.io.*;

public class TestFileReader
{
	public static void main(String[] args)
	{
	int b = 0;
	FileReader fr = null;
	try
	{
		int num = 0;
		fr = new FileReader("e:\\javawebcode\\TestFileReader.java");
		while((b = fr.read()) != -1)
		{
			System.out.print((char)b);
			num ++;
		}
		System.out.println("共读取了" + num + "字");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("文件未找到");
	}
	catch(IOException ioe)
	{
		System.out.println("读取错误");
	}
}
}