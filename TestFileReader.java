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
		System.out.println("����ȡ��" + num + "��");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("�ļ�δ�ҵ�");
	}
	catch(IOException ioe)
	{
		System.out.println("��ȡ����");
	}
}
}