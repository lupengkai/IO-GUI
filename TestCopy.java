import java.io.*;

public class TestCopy
{
	public static void main(String[] args)
	{
		FileReader fr = null;
		FileWriter fw = null;
		int b = 0;
		try
		{
			fr = new FileReader("e:\\javawebcode\\TestFileReader.java");
			fw = new FileWriter("e:\\javawebcode\\TFR.java");
			while((b= fr.read())!= -1 )
			{
				fw.write(b);
			}
			fr.close();
			fw.flush();
			fw.close();

			System.out.println("Copy Complete");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch (IOException ioe)
		{
			System.out.println("IO Exception");
		}
	}
}