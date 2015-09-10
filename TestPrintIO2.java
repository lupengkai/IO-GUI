import java.io.*;


public class TestPrintIO2
{
	public static void main(String[] args)
	{
		String fileName = args[0];
		if(fileName != null) list(fileName,System.out);
	}
	public static void list(String s,PrintStream ps)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(s));
			String f = null;
			while((f=br.readLine()) != null)
			{
				ps.println(f);
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}