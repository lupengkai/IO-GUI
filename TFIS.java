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
			System.out.println("����ȡ��" + num + "���ַ�");
		}
		catch(IOException ioe)
		{
			System.out.println("�ļ���ȡ����");
		}
	}
}