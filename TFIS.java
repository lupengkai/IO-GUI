import java.io.*;

public class TestFileInputStream
{
	public static void main(String[] args)
	{
		int b = 0;
		FileInputStream fin = null;
		try{
			fin = new FileInputStream("e:\\javawebcode\\TestFileInputStream.java");
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found.");
			System.exit(-1);

		}
		try{
			long num = 0;
			while ((b = fin.read() )!= -1)
			{
				System.out.print((char)b);
				num ++;
			}
			fin.close();
			System.out.println();
			System.out.println("共读取了" + num + "个字符");
		}
		catch(IOException ioe)
		{
			System.out.println("文件读取错误");
		}
	}
}