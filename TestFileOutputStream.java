import java.io.*;

public class  TestFileOutputStream
{
	public static void main(String args[])
	{
		int b = 0;
		try{
			FileInputStream fin = new FileInputStream("e:\\javawebcode\\TestFileInputStream.java");
			FileOutputStream fos = new FileOutputStream("e:\\javawebcode\\TFIS.java");
			while ((b=fin.read()) != -1)
			{
				fos.write(b);
			}
			
			fin.close();
			fos.flush();
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("�ļ�δ�ҵ�");
			System.exit(-1);
		}
		catch(IOException ioe)
		{
			System.out.println("�ļ��ƴ���");
			System.exit(-1);
		}
		System.out.println("�ļ��Ѹ���");

	}
}